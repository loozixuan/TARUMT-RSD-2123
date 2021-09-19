using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Prac3Lab2
{
    public partial class BreakfastDetails : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void RadioButtonList1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (rbSet.SelectedValue=="Set 1")
            {
                lblSetDetail.Text = "<u>Menu Set 1 </u><br/> Nasi Lemak " +
                                     "<br/> Teh Tarik <br/> <b>RM 12.50</b>";
            }
            else if (rbSet.SelectedValue == "Set 2")
            {
                lblSetDetail.Text = "<u>Menu Set 2</u> <br/> Mee Goreng <br/> Fried Egg " +
                                     "<br/> Teh Tarik <br/> <b>RM 8.50</b>";
            }
            else {
                lblSetDetail.Text = "<u>Menu Set 3 </u><br/> Chicken Sauseges <br/> Omelette" +
                                     "<br/> Read Beans <br/> Coffee  <br/> <b>RM 10.50</b>";
            }
        }
    
        protected void btnConfirm_Click(object sender, EventArgs e)
        {
            if (!chkboxSet1.Checked && !chkboxSet2.Checked && !chkboxSet3.Checked)
            {
                lblError.Text = "Please select at least one checkbox";
            }
            else {
                btnConfirm.PostBackUrl = "~/ConfirmOrder.aspx";
            }
        }

        protected void btnCalcuate_Click(object sender, EventArgs e)
        {
            double setPrice, totalSetPrice, totalPrice = 0.0;
           
            if (chkboxSet1.Checked)
            {
                if (txtSet1.Text != "")
                {
                    setPrice = 12.5;
                    int qty = int.Parse(txtSet1.Text);
                    totalSetPrice = setPrice * qty;
                    lblPriceSet1.Text = "" + totalSetPrice;
                    totalPrice += totalSetPrice;
                }
            }

            if (txtSet2.Text != "")
            {
                setPrice = 8.5;
                int qty = int.Parse(txtSet2.Text);
                totalSetPrice = setPrice * qty;
                lblPriceSet2.Text = "" + totalSetPrice;
                totalPrice += totalSetPrice;
            }

            if (txtSet3.Text != "")
            {
                setPrice = 10.5;
                int qty = int.Parse(txtSet3.Text);
                totalSetPrice = setPrice * qty;
                lblPriceSet3.Text = "" + totalSetPrice;
                totalPrice += totalSetPrice;
            }
            lblTotalPrice.Text = totalPrice.ToString("C");
            
            
        }

        protected void btnCancel_Click(object sender, EventArgs e)
        {
            chkboxSet1.Checked = false;
            chkboxSet2.Checked = false;
            chkboxSet2.Checked = false;
            lblPriceSet1.Text = "";
            lblPriceSet2.Text = "";
            lblPriceSet3.Text = "";
            lblTotalPrice.Text = "";
            txtSet1.Text = "";
            txtSet2.Text = "";
            txtSet3.Text = "";
        }
    }
    
}