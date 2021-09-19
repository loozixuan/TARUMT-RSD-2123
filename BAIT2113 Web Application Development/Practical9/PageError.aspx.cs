using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class PageError : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        void Page_Error() {
            Response.Write("<p style='background-color:#BBBBBB;font-weight:bold;width:600px;padding:10px'>Sorry<br/>One error is encountered in this page: ");
            Response.Write("<b style='color:red'>" + Server.GetLastError().Message+ "</span></p>");
            Server.ClearError();
        }

        protected void EqualButton_Click(object sender, ImageClickEventArgs e)
        {

            lblMessage.Text = "";
            Label1.Text = "?";
            double dblAns = 0.0;

            double dblNo1 = Convert.ToDouble(TextBox1.Text);
            double dblNo2 = Convert.ToDouble(TextBox2.Text);

            dblAns = Divide(dblNo1, dblNo2);
            Label1.Text = dblAns.ToString();

        }

        protected double Divide(double no1, double no2)
        {
            if (no2 == 0)
            {
                DivideByZeroException err = new DivideByZeroException();
                throw err;
            }
            else
                return no1 / no2;
        }
    }
}