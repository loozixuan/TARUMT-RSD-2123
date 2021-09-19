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
    public partial class SalesOrderInfo : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnSearch_Click(object sender, EventArgs e)
        {
            SqlConnection con;
            string strCon = ConfigurationManager.ConnectionStrings["ConnectionString"].ConnectionString;

            con = new SqlConnection(strCon);
            con.Open();

            string strSelect = "SELECT SUM(OD.UnitPrice*OD.Quantity-OD.Discount) FROM [Order Details] OD, ORDERS O,EMPLOYEES E WHERE O.EMPLOYEEID=E.EMPLOYEEID AND E.FIRSTNAME + ' ' + E.LASTNAME=@name AND YEAR(ORDERDATE)=@date";

            SqlCommand cmdSelect = new SqlCommand(strSelect, con);
            cmdSelect.Parameters.AddWithValue("@name", ddlName.SelectedValue);
            cmdSelect.Parameters.AddWithValue("@date", rbYear.SelectedValue);

            object result = cmdSelect.ExecuteScalar();
            double totalSales;
            if (result != null)
            {
                totalSales = Double.Parse(result.ToString());
                totalSales = Math.Round(totalSales, 2);
                lblTitleGridView.Text = "Sales Order by "+ ddlName.SelectedValue + " in the year of "
                    + rbYear.SelectedValue + ". Grand Total Sales: $" + totalSales.ToString();
            }
            else {
                lblTitleGridView.Text = "No Sales";
            }

            con.Close();
        }

        protected void GridView1_SelectedIndexChanged(object sender, EventArgs e)
        {
            double totalSales = 0.0;
            SqlConnection con;
            string strCon = ConfigurationManager.ConnectionStrings["ConnectionString"].ConnectionString;

            con = new SqlConnection(strCon);
            con.Open();
            string strSelect = "SELECT * FROM [Order Details] AS OD INNER JOIN Products AS P ON OD.ProductID = P.ProductID WHERE (OD.OrderID = @orderid)";
            SqlCommand cmdSelect = new SqlCommand(strSelect, con);
            cmdSelect.Parameters.AddWithValue("@orderid", GridView1.SelectedRow.Cells[1].Text);
            SqlDataReader dtrInfo = cmdSelect.ExecuteReader();

            if (dtrInfo.HasRows)
            {
                while (dtrInfo.Read())
                {
                    totalSales += (Double.Parse(dtrInfo["UnitPrice"].ToString()) 
                        * Double.Parse(dtrInfo["Quantity"].ToString()) - Double.Parse(dtrInfo["Discount"].ToString()));
                }
                lblOldSales.Text = "Total Sales for <b>Order Id:" + GridView1.SelectedRow.Cells[1].Text + "=$" + totalSales+"</b>";
            }
            con.Close();

        }

    }
}