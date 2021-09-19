using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace SessionState
{
    public partial class FirstPage : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            
        }

        protected void link_Click(object sender, EventArgs e)
        {
            string name = txtName.Text;
            string programme = rbProgramme.SelectedValue;
            string language = ddlLanguage.SelectedValue;
            link.PostBackUrl = "~/Welcome.aspx?name=" + name + "&programme=" + programme + "&language=" + language;
        }
    }
}