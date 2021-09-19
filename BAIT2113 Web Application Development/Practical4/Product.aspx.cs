using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Configuration;

namespace Prac4LabExercise
{
    public partial class Product : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Repeater1_ItemCommand(object source, RepeaterCommandEventArgs e)
        {

        }

        protected void btnFind_Click(object sender, EventArgs e)
        {

            SqlConnection con;
            string strCon = ConfigurationManager.ConnectionStrings["ConnectionString"].ConnectionString;
           
            con = new SqlConnection(strCon);
            con.Open();

            string strSelect = "SELECT PRODUCTNAME, UNITPRICE FROM CATEGORIES C, PRODUCTS P WHERE C.CATEGORYID=P.CATEGORYID AND categoryName = @categoryName";

            SqlCommand cmdSelect = new SqlCommand(strSelect, con);
            cmdSelect.Parameters.AddWithValue("@categoryName", ddlCategory.SelectedValue);

            SqlDataReader dtrInfo = cmdSelect.ExecuteReader();

            
            if (dtrInfo.HasRows)
            {
                while (dtrInfo.Read())
                {
                    Repeater1.DataSource = dtrInfo;
                    Repeater1.DataBind();
                }
                lblResult.Text = Repeater1.Items.Count + "";
            }
            else
            {
                lblResult.Text = "0";
            }
            con.Close();
        }
       
    }
}