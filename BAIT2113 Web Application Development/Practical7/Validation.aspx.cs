using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Practical7
{
    public partial class Validation : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            string creditCardType = rblCreditCardType.SelectedValue.ToString();

            if (creditCardType.Equals("Visa"))
            {
                RegularExpressionValidator2.ValidationExpression = "^4[0-9]{12}(?:[0-9]{3})?$";
            }
            else
            {
                RegularExpressionValidator2.ValidationExpression = "^5[0-9]{12}(?:[0-9]{3})?$";
            }
        }

        protected void btnSubmit_Click(object sender, EventArgs e)
        {

            lblMsg.Text = "You have entered the following:<br/>" +
                " User name: " + txtName.Text + 
                "<br/> Password: " + txtPassword.Text + 
                "<br/> Age: " + txtAge1.Text + 
                "<br/>Date of birth: " + txtDOB.Text + 
                "<br/> Credit card number: " + txtCreditCardNumber.Text;
        }

        protected void btnClear_Click(object sender, EventArgs e)
        {
            txtAge1.Text = "";
            txtCreditCardNumber.Text = "";
            txtDOB.Text = "";
            txtName.Text = "";
            txtPassword.Text = "";
        }
    }
}