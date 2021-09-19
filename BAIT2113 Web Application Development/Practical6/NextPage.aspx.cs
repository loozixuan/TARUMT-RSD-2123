using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace SessionState
{
    public partial class NextPage : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            lblVisitor.Text = Application["visitor"].ToString();
            lblDate.Text = Application["dateTime"].ToString();
        }
    }
}