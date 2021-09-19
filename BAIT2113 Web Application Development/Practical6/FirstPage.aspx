<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="FirstPage.aspx.cs" Inherits="SessionState.FirstPage" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            Name:
            <asp:TextBox ID="txtName" runat="server"></asp:TextBox>
            <br />
            <br />
            Programme:
            <asp:RadioButtonList ID="rbProgramme" runat="server" RepeatDirection="Horizontal">
                <asp:ListItem>RIS2</asp:ListItem>
                <asp:ListItem>RIT2</asp:ListItem>
                <asp:ListItem>RSD2</asp:ListItem>
                <asp:ListItem>RSF2</asp:ListItem>
            </asp:RadioButtonList>
            <br />
            Language:
            <asp:DropDownList ID="ddlLanguage" runat="server">
                <asp:ListItem>English</asp:ListItem>
                <asp:ListItem>Malay</asp:ListItem>
            </asp:DropDownList>
            <br />
            <br />
            <asp:LinkButton ID="link" runat="server" OnClick="link_Click">Go</asp:LinkButton>
        </div>
    </form>
</body>
</html>
