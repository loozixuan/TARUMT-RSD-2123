using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.Security;

namespace Practical5
{
    public partial class UserRole : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void btnAdd_Click(object sender, EventArgs e)
        {
            Roles.CreateRole(txtRole.Text);
        }

        protected void btnGetRole_Click(object sender, EventArgs e)
        {
            lstRole.DataSource = Roles.GetAllRoles();
            lstRole.DataBind();

        }

        protected void btnGetUser_Click(object sender, EventArgs e)
        {
            lstUser.DataSource = Membership.GetAllUsers();
            lstUser.DataBind();
        }

        protected void btnAddUtoR_Click(object sender, EventArgs e)
        {

            Roles.AddUserToRole(lstUser.SelectedItem.Text, lstRole.SelectedItem.Text);
        }

        protected void btnGetUserInRole_Click(object sender, EventArgs e)
        {
            lstUInRole.DataSource = Roles.GetUsersInRole(lstRole.SelectedItem.Text);
            lstUInRole.DataBind();
        }
    }
}