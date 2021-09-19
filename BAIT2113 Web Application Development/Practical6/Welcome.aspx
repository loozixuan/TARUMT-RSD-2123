<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Welcome.aspx.cs" Inherits="SessionState.Welcome" %>
<%@ OutputCache Duration="60" VaryByParam="language"%>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            Hello,
            <asp:Label ID="lblName" runat="server"></asp:Label>
&nbsp;from
            <asp:Label ID="lblProgramme" runat="server"></asp:Label>
            <br />
            <br />
            <asp:Label ID="lblMsg" runat="server" Text="Label"></asp:Label><br />
            <br />
            <asp:Label ID="lblcache" runat="server" Text="Label"></asp:Label>
            <asp:Label ID="lblDate" runat="server"></asp:Label>
        </div>
    </form>
</body>
</html>
