<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="Practical5LabExercise.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
             <table class="auto-style7">
                <tr>
                    <td class="auto-style2">User Roles</td>
                    <td class="auto-style4">
                        <asp:TextBox ID="txtRole" runat="server"></asp:TextBox>
                    </td>
                    <td class="auto-style1">
                        <asp:Button ID="btnAdd" runat="server" CssClass="auto-style6" OnClick="btnAdd_Click" Text="Add Role" />
                    </td>
                </tr>
                <tr>
                    <td class="auto-style3">Get Roles</td>
                    <td class="auto-style5">
                        <asp:ListBox ID="lstRole" runat="server"></asp:ListBox>
                    </td>
                    <td>
                        <asp:Button ID="btnGetRole" runat="server" CssClass="auto-style6" Height="26px" OnClick="btnGetRole_Click" Text="Get Role(s)" />
                    </td>
                </tr>
                <tr>
                    <td class="auto-style3">&nbsp;</td>
                    <td class="auto-style5">&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td class="auto-style3">Get Users</td>
                    <td class="auto-style5">
                        <asp:ListBox ID="lstUser" runat="server"></asp:ListBox>
                    </td>
                    <td>
                        <asp:Button ID="btnGetUser" runat="server" CssClass="auto-style6" Height="26px" OnClick="btnGetUser_Click" Text="Get User(s)" />
                    </td>
                </tr>
                <tr>
                    <td class="auto-style3">&nbsp;</td>
                    <td class="auto-style5">&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td class="auto-style3">Add User to Role</td>
                    <td class="auto-style5">&nbsp;</td>
                    <td>
                        <asp:Button ID="btnAddUtoR" runat="server" CssClass="auto-style6" Height="26px" OnClick="btnAddUtoR_Click" Text="Add User to Role" />
                    </td>
                </tr>
                <tr>
                    <td class="auto-style3">&nbsp;</td>
                    <td class="auto-style5">&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td class="auto-style8">Get User in Role</td>
                    <td class="auto-style9">
                        <asp:ListBox ID="lstUInRole" runat="server"></asp:ListBox>
                    </td>
                    <td class="auto-style10">
                        <asp:Button ID="btnGetUserInRole" runat="server" CssClass="auto-style6" Height="26px" OnClick="btnGetUserInRole_Click" Text="Get User in Role" />
                    </td>
                </tr>
                <tr>
                    <td class="auto-style3">&nbsp;</td>
                    <td class="auto-style5">&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td class="auto-style3">&nbsp;</td>
                    <td class="auto-style5">&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
            </table>

        </div>
    </form>
</body>
</html>
