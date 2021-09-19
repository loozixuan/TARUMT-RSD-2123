using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Practical2LabExercise
{
    public partial class CarSticker : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void RadioButtonList1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        protected void btnSubmit_Click(object sender, EventArgs e)
        {
            if (txtName.Text != "" && txtID.Text != "" && txtYearOfStudy.Text != "" &&
                txtDate.Text != "" && rbGender.SelectedValue != "" && txtRegNo.Text != "")
            {         
                lblMsg.Text = "Hi, <b>" + txtName.Text + "</b> from " + ddlProg.SelectedItem.Value + " programee. <br /><br />"
                                + "Your Information : <br />" +
                                "<br /> Student ID : " + txtID.Text +
                                "<br /> Joined Date : " + txtDate.Text +
                                "<br /> Gender : " + rbGender.SelectedItem.Value +
                                "<br /> Year Of Study : " + txtYearOfStudy.Text +
                                "<br /> Vehicle's Registration Number : " + txtRegNo.Text +
                                "<br /> Vehicle's Type : " + ddlVehicleType.SelectedItem.Value;               
            }
            else
            {
                //lblMsg.Style.Add("color","red");
                //lblMsg.Style.Add("font-weight", "bold");
                lblMsg.Text = "Please enter all the information before submit!!!";
            }
        }
    }
}