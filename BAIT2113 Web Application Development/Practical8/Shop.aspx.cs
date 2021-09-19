using System;
using System.Collections;
using System.Configuration;
using System.Data;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;

public partial class Shop : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        //Set the session named username and current DateTime to the
        //Labels User Control properties
        if (Session["username"] != null)
        {
            ctlHeader.Username = Session["username"].ToString();
            ctlHeader.LoginTime = DateTime.Now.ToString();
        }
        else {
            Response.Redirect("~/Login.aspx");
        }
 
    }
}
