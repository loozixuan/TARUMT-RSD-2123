using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

using System.Net;
using System.Net.Mail;

namespace EmailDemo
{
    public partial class Email : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            MailMessage msg = new MailMessage();
            msg.From = new MailAddress(""); //Your Email ID
            msg.To.Add(TextBox1.Text);
            msg.Subject = "Reply from me";
            msg.Body = TextBox2.Text;
            msg.IsBodyHtml = true;

            SmtpClient smt = new SmtpClient();
            smt.Host = "smtp.gmail.com";
            System.Net.NetworkCredential ntwd = new NetworkCredential();
            ntwd.UserName = ""; //Your Email ID  
            ntwd.Password = ""; // Your Password  
            smt.UseDefaultCredentials = true;
            smt.Credentials = ntwd;
            smt.Port = 587;
            smt.EnableSsl = true;
            smt.Send(msg);
            lbmsg.Text = "Email Sent Successfully";
            lbmsg.ForeColor = System.Drawing.Color.ForestGreen;

        }
    }
}