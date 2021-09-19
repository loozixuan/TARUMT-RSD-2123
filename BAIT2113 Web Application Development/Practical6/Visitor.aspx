<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Visitor.aspx.cs" Inherits="SessionState.Visitor" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <link id="css" href="<%= (string)Session["SelectedCss"] %>" type="text/css" rel="stylesheet" />
</head>
<body>
    <form id="form1" runat="server">
        <div>
            You are visitor :
            <asp:Label ID="lblNoOfVisitor" runat="server"></asp:Label>
            <br />
            You access on
            <asp:Label ID="lblDate" runat="server"></asp:Label>
&nbsp;&nbsp;
            <br />
            <br />
            Choose a theme:<br />
            <asp:DropDownList ID="ddlCSS" runat="server">
                <asp:ListItem>Standard</asp:ListItem>
                <asp:ListItem>Special</asp:ListItem>
            </asp:DropDownList>
&nbsp;<asp:Button ID="btnApply" runat="server" Text="Apply" OnClick="btnApply_Click" />
            <br />
            <br />
            <asp:CheckBox ID="chkPreference" runat="server" Text="Remember Preference" OnCheckedChanged="chkPreference_CheckedChanged" AutoPostBack="True" />
            <br />
            <br />
            <asp:HyperLink ID="hlNextPage" runat="server" NavigateUrl="~/NextPage.aspx">Next Page</asp:HyperLink>
        </div>
    </form>
    <p>
&nbsp;</p>
</body>
</html>
