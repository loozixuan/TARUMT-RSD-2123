using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class TryCatch : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void EqualButton_Click(object sender, ImageClickEventArgs e)
        {
            lblMessage.Text = "";
            Label1.Text = "?";
            double dblAns = 0.0;

            try
            {
                double dblNo1 = Convert.ToDouble(TextBox1.Text);
                double dblNo2 = Convert.ToDouble(TextBox2.Text);

                dblAns = Divide(dblNo1, dblNo2);
                Label1.Text = dblAns.ToString();
            }
            catch (DivideByZeroException ex) {
                lblMessage.Text = ex.Message;
            }
        }

        protected double Divide(double no1, double no2)
        {
            if (no2 == 0)
            {
                DivideByZeroException err = new DivideByZeroException();
                throw err;
            }
            else
                return no1 / no2;
        }
    }
}