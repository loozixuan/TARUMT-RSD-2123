using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace SessionState
{
    public partial class Welcome : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            string name = Request.QueryString["name"];
            string programme = Request.QueryString["programme"];
            string language = Request.QueryString["language"];

            lblName.Text = name;
            lblProgramme.Text = programme;
            if (language.Equals("English"))
            {
                lblMsg.Text = "Welcome to BAIT2113 Web Application Development Website";
                lblcache.Text = "This page is cached on ";
            }
            else {
                lblMsg.Text = "Selamat datang ke laman BAIT2113 Web Application Development";
                lblcache.Text = "Halaman ini cache pada ";
            }
            lblDate.Text = DateTime.Now.ToString();
        }
    }
}