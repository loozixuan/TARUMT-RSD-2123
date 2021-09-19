using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.SessionState;

namespace Prac9__Materials_
{
    public class Global : System.Web.HttpApplication
    {
        protected void Application_Start(object sender, EventArgs e)
        {
        }

        protected void Application_Error(object sender, EventArgs e)
        {
            Exception ex = Server.GetLastError();
            //store the error for later
            Application["exception"] = ex;
            //store the location of file that made error
            Application["location"] = Request.Url.ToString();
            //clear the error so we can continue onwards     
            Server.ClearError();
            //send user to GeneralError page        
            Response.Redirect("ErrorPages/GeneralError.aspx"); 

        }
    }
}