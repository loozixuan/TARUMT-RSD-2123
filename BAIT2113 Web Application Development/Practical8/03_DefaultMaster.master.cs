using System;
using System.Collections;
using System.Configuration;
using System.Data;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;

public partial class DefaultMaster : System.Web.UI.MasterPage
{
    protected void Page_Load(object sender, EventArgs e)
    {
        //Retrieve Gender from Cookie 
        //and display different advertisement banner based on gender
        //place your code here...
        string gender = "";
        HttpCookie cookie = Request.Cookies["Gender"];
        if (cookie != null)
            gender = Request.Cookies["Gender"].Value;

        if (gender.Equals("F")) {
            Control MyControl = (Control)LoadControl("female.ascx");
            contentAd.Controls.Add(MyControl);
        } else if (gender.Equals("M")) {
            Control MyControl = (Control)LoadControl("male.ascx");
            contentAd.Controls.Add(MyControl);
        }
        else {
            Control MyControl = (Control)LoadControl("general.ascx");
            contentAd.Controls.Add(MyControl);
        }

    }
    protected void ImageButton1_Click(object sender, ImageClickEventArgs e)
    {
        Response.Redirect("Default.aspx");
    }
    protected void ImageButton2_Click(object sender, ImageClickEventArgs e)
    {
        Response.Redirect("Shop.aspx");
    }
    protected void ImageButton3_Click(object sender, ImageClickEventArgs e)
    {
        Response.Redirect("Contact.aspx");
    }
}
