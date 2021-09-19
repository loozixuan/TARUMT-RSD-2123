using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Prac3Lab2
{
    public partial class ConfirmOrder : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
        
            if (PreviousPage != null && PreviousPage.IsCrossPagePostBack)
            {
               
                Label totalPrice = PreviousPage.FindControl("lblTotalPrice") as Label;
                CheckBox set1 = PreviousPage.FindControl("chkboxSet1") as CheckBox;
                CheckBox set2 = PreviousPage.FindControl("chkboxSet2") as CheckBox;
                CheckBox set3 = PreviousPage.FindControl("chkboxSet3") as CheckBox;
                TextBox qtySet1 = PreviousPage.FindControl("txtSet1") as TextBox;
                TextBox qtySet2 = PreviousPage.FindControl("txtSet2") as TextBox;
                TextBox qtySet3 = PreviousPage.FindControl("txtSet3") as TextBox;

                if (set1.Checked)
                {
                    lblOrder.Text += "Menu Set 1 - " + qtySet1.Text;
                    if (set2.Checked)
                    {
                        lblOrder.Text += "<br/>Menu Set 2 - " + qtySet2.Text;
                        if (set3.Checked)
                        {
                            lblOrder.Text += "<br/>Menu Set 3 - " + qtySet3.Text;

                        }
                    }
                }
                else if (set2.Checked)
                {
                    lblOrder.Text += "Menu Set 2 - " + qtySet2.Text;
                    if (set1.Checked)
                    {
                        lblOrder.Text += "<br/>Menu Set 1 - " + qtySet1.Text;
                        if (set3.Checked)
                        {
                            lblOrder.Text += "<br/>Menu Set 3 - " + qtySet3.Text;

                        }
                    }
                }
                else {
                    lblOrder.Text += "Menu Set 3 - " + qtySet3.Text;
                    if (set1.Checked)
                    {
                        lblOrder.Text += "<br/>Menu Set 1 - " + qtySet1.Text;
                        if (set2.Checked)
                        {
                            lblOrder.Text += "<br/>Menu Set 2 - " + qtySet2.Text;

                        }
                    }
                }
               
                lblOrder.Text += "<br/>Total Price = " + totalPrice.Text; 
                lblTimeNow.Text= DateTime.Now.ToString("HH:mm tt");
                lblReceiveTime.Text = DateTime.Now.AddMinutes(25).ToString("HH:mm tt");
            }
        }
    }
}