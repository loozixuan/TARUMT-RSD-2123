using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace SessionState
{
    public partial class Cookies : System.Web.UI.Page
    {
       

        protected void Page_Load(object sender, EventArgs e)
        {
            // Create the cookie object.
            // HttpCookie cookie = new HttpCookie("CookieName");
            // Set a value in it.
            //cookie["Language"] = "Tamil";
            // Add another value.
            //cookie["Country"] = "India";
            // Add it to the current web response.
            //Response.Cookies.Add(cookie);

            // This cookie lives for one year.

            //cookie.Expires = DateTime.Now.AddYears(1);
            HttpCookie cookie = Request.Cookies["CookieName"];
            string value = "";

            if (cookie == null)
            {
                lblCookies.Text = "Cookie Not Found! Now you can set Cookies with value By using Cookie Button";
            }
            else {
                value = cookie["value"];
                lblCookies.Text = "Cookie Found! The value of Cookie is " + value;
            }
        }

        protected void btnSetCookies_Click(object sender, EventArgs e)
        {
            HttpCookie cookie = new HttpCookie("CookieName");
            cookie["value"] = txtCookies.Text;
            Response.Cookies.Add(cookie);
        }

        //protected void btnClick_Click(object sender, EventArgs e)
        //{
        //    HttpCookie cookie = Request.Cookies["CookieName"];
        //    Check to see whether a cookie was found with this name.
        //    string language = "";
        //    string country = "";
        //    if (cookie != null)
        //    {
        //        language = cookie["Language"];
        //        country = cookie["Country"];
        //    }
        //    lblCookies.Text = "<b>Language : <b>" + language + "<br />"
        //                    + "<b>Country : </b>" + country;

        //}
    }
}