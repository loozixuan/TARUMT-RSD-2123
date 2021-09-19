<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Menu.aspx.cs" Inherits="Practical5.Menu" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            The Halloween Store - Authentication Tests<br />
            <br />
            <asp:HyperLink ID="hlOrder" runat="server" NavigateUrl="~/Order.aspx">Order a Product</asp:HyperLink>
            <br />
            (All users including anonymous users)<br />
            <br />
            <asp:HyperLink ID="hlAccount" runat="server" NavigateUrl="~/MyAccount/MyAccount.aspx">Edit My Account</asp:HyperLink>
            <br />
            (All authenticated users)<br />
            <br />
            <asp:HyperLink ID="hlMaintain" runat="server" NavigateUrl="~/Maintenance/Maintenance.aspx">Maintain Data Tables</asp:HyperLink>
            <br />
            (Only users assocaited with the Admin role)</div>
    </form>
</body>
</html>
