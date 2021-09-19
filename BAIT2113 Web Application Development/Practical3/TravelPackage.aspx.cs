using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Prac3Lab1
{
    public partial class TravelPackage : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                lblDisplay.Text = "Thank you for using our services";
            }

        }

        double calculatePrice() {
            double price = 0.0;
            if (ddlFrom.SelectedValue == "KL" && ddlTo.SelectedValue == "Japan")
            {
                  price = 2400;
            }
            else if (ddlFrom.SelectedValue == "KL" && ddlTo.SelectedValue == "Aucklang")
            {
                  price = 2200;
              
            }
            else if (ddlFrom.SelectedValue == "Penang" && ddlTo.SelectedValue == "Japan")
            {
                 price = 3400;              
            }
            else {
                 price = 3200;              
            }
            return price;
        }

        double differencesPrice(double destPrice, double budgetPrice) {
            double differencePrice = 0.0;

            differencePrice = budgetPrice - destPrice;
            return differencePrice;         
        }

        protected void btnCheck_Click(object sender, EventArgs e)
        {
            double price = calculatePrice();
            double differencePrice = differencesPrice(price, Double.Parse(txtBudget.Text));
        
            if (differencePrice > 0.0)
            {
                lblDisplay.Text = "<b>Happy Holiday from MOM Travel !!!</b>";
                lblMessage.Text = "Your Destination : " + ddlFrom.SelectedValue + " - " + ddlTo.Text
                    + "<br/> Yay!Can go for holiday!" + "<br/>" +
                    differencePrice.ToString("C") + " extra pocket money ";
            }
            else
            {
                differencePrice = System.Math.Abs(differencePrice);
                lblMessage.Text = "Your Destination : " + ddlFrom.SelectedValue + " - " + ddlTo.Text
                       + "<br/> OH NO ! Cannot go for holiday!" + "<br/> Still need RM " +
                       differencePrice.ToString("C");
            }
        }
    }
}