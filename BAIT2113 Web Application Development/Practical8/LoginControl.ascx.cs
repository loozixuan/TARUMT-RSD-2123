using System;
using System.Collections;
using System.Configuration;
using System.Data;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Data.SqlClient;

public partial class LoginControl : System.Web.UI.UserControl
{


    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Validate(object sender, ServerValidateEventArgs e)
    {
        //retrieving data from the database
        SqlConnection con;
        string strCon = ConfigurationManager.ConnectionStrings["ConMember"].ConnectionString;
        con = new SqlConnection(strCon);

        string strSelect = "Select Gender From Member Where Username = @user AND Password = @pwd";
        SqlCommand cmdSelect = new SqlCommand(strSelect, con);
        cmdSelect.Parameters.AddWithValue("@user", TextBox1.Text);
        cmdSelect.Parameters.AddWithValue("@pwd", TextBox2.Text);
        con.Open();
        SqlDataReader dtr = cmdSelect.ExecuteReader();

        if (dtr.HasRows)
        {
            if (dtr.Read())
            {
                //This cookie will be stored in the user's PC
                //It is needed to display the advertisement banner based on gender
                string Gender = dtr["Gender"].ToString();
                HttpCookie cookie = new HttpCookie("Gender", Gender);
                cookie.Expires = DateTime.Now.AddDays(30);
                Response.Cookies.Add(cookie);
                
                //This Session will be used by Shop.aspx
                Session["username"] = TextBox1.Text;

                //autheticate the user to access Shop.aspx
                FormsAuthentication.RedirectFromLoginPage(TextBox1.Text, false);
                
                //pass the server-side validation
                e.IsValid = true;

                //Transfer the user to Shop.aspx
                Response.Redirect("Shop.aspx");
                
            }
        }
        else
            e.IsValid = false;

        dtr.Close();
        con.Close();

    }

   

}
