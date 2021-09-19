using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Prac8
{
    public partial class Labels : System.Web.UI.UserControl
    {
        public string Username;
        public string LoginTime;

        protected void Page_Load(object sender, EventArgs e)
        {
            lblUsername.Text = Username;
            lblLoginTime.Text = LoginTime;
        }
    }
}