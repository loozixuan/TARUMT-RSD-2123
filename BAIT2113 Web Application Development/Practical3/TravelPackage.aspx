<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="TravelPackage.aspx.cs" Inherits="Prac3Lab1.TravelPackage" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .auto-style2 {
            height: 26px;
            width: 398px;
        }
        .auto-style3 {
            width: 398px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <div style="font-weight:bold;text-decoration:underline; font-size: x-large;">Holiday Travel Package</div><br />
            <asp:Label ID="lblDisplay" runat="server"></asp:Label>
            <br />
            <br />
            <table style="width:100%;">
                <tr>
                    <td class="auto-style2">Your Budget:&nbsp;&nbsp;
                        <asp:TextBox ID="txtBudget" runat="server"></asp:TextBox>
                        <br />
                        <br />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="auto-style3">Choose you destination : 
                        <br />
                        <br />
                    </td>
                </tr>
                <tr>
                    <td class="auto-style3">From&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; To<br />
                        <br />
                        <asp:DropDownList ID="ddlFrom" runat="server">
                            <asp:ListItem>KL</asp:ListItem>
                            <asp:ListItem>Penang</asp:ListItem>
                        </asp:DropDownList>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <asp:DropDownList ID="ddlTo" runat="server">
                            <asp:ListItem>Japan</asp:ListItem>
                            <asp:ListItem>Auckland</asp:ListItem>
                        </asp:DropDownList>
                        <br />
                        <br />
                    </td>
                </tr>
                  <tr>
                    <td class="auto-style3">
                        <asp:Button ID="btnCheck" runat="server" Text="Check" OnClick="btnCheck_Click" />
                        <br />
                        <br />
                    </td>
                </tr>
            </table>
        </div>
        <asp:Label ID="lblMessage" runat="server"></asp:Label>
    </form>
</body>
</html>
