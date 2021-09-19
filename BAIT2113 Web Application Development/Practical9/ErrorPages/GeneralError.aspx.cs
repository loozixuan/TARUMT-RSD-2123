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

public partial class GeneralError : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (Application["exception"] != null)
        {
            Exception ex = new Exception();
            ex = (Exception)Application["exception"];
            string FileUrl = (string)Application["location"];
            //write code to display the detailed messages  
            Response.Write("<div style='background-color:#BBBBBB; font-family:Calibri; padding: 5px 5px 5px 5px;font-weight:bold'>Alert<br/>" 
                + "One error was encountered in " + FileUrl + " : <b style='color:red'>" +
                ex.Message + "</span><br/><br/><span style='color:black'>" + ex.InnerException +"</span></div>");
        }

    }
}
