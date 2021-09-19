using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace SessionState
{
    public partial class Default : System.Web.UI.Page
    {

        string _str = String.Empty;

        protected void Page_Load(object sender, EventArgs e)
        {
            this.LabelShowString.Text = this._str;
        }

        protected void SubmitString_Click(object sender, EventArgs e)
        {
            this._str = this.TextBox1.Text;
            this.Session["str"] = this.TextBox1.Text;
            this.LabelShowString.Text = this._str;

            this.LabelShowStringAsSessionState.Text = (String)this.Session["str"];

        }

        protected void JustSubmit_Click(object sender, EventArgs e)
        {

        }
    }
}