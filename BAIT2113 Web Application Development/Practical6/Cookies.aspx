<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Cookies.aspx.cs" Inherits="SessionState.Cookies" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Label ID="lblCookies" runat="server"></asp:Label>
            <br />
            <br />
            Enter value To store in Cookie:
            <asp:TextBox ID="txtCookies" runat="server"></asp:TextBox>
            <br />
            <br />
            <asp:Button ID="btnSetCookies" runat="server" OnClick="btnSetCookies_Click" Text="Set Cookie" />
        </div>
    </form>
</body>
</html>
