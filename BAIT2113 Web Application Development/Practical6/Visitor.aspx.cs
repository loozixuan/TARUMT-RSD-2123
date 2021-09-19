using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace SessionState
{
    public partial class Visitor : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            string theme="";
            HttpCookie cookie = Request.Cookies["CookieName"];
            if (cookie != null)
            {
                theme = cookie["theme"];
                Session["SelectedCss"] = theme;
            }
            lblNoOfVisitor.Text = Application["visitor"].ToString();
            lblDate.Text = Application["dateTime"].ToString() ;
        }

        protected void btnApply_Click(object sender, EventArgs e)
        {
            string css = ddlCSS.SelectedValue;
            if (css.Equals("Standard"))
            {
                Session["SelectedCss"] = "Standard.css";
            }
            else {
                Session["SelectedCss"] = "Special.css";
            }
        }

        protected void chkPreference_CheckedChanged(object sender, EventArgs e)
        {
            if (chkPreference.Checked) {
                HttpCookie cookie = new HttpCookie("CookieName");
                cookie["theme"] = Session["SelectedCss"].ToString();
                Response.Cookies.Add(cookie);
                cookie.Expires = DateTime.Now.AddDays(30);
            }
        }
    }
}