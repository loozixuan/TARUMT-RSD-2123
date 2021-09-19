<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="PageError.aspx.cs" Inherits="WebApplication1.PageError" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Error Handling</title>  
    
</head>
<body>
    <form id="form1" runat="server">
<div style="text-align:center">
<p style="width:60%; padding:30px 20px 30px 20px; border:solid 3px black">
    <asp:TextBox ID="TextBox1" runat="server" Height="43px" Width="66px" 
        Font-Bold="True" Font-Names="Comic Sans MS" Font-Size="X-Large"></asp:TextBox>
&nbsp;&nbsp;<img alt="" src="images/Divide.jpg" style="height: 39px; width: 65px" />&nbsp;
    <asp:TextBox ID="TextBox2" runat="server" Height="43px" Width="66px" 
        Font-Bold="True" Font-Names="Comic Sans MS" Font-Size="X-Large"></asp:TextBox>
&nbsp;<asp:ImageButton ID="EqualButton" runat="server" Height="44px" 
        ImageUrl="~/images/EqualButton.jpg" Width="50px" 
        onclick="EqualButton_Click" />
&nbsp;<asp:Label ID="Label1" runat="server" Font-Bold="True" 
        Font-Names="Comic Sans MS" Font-Size="XX-Large" ForeColor="Blue" Text="?"></asp:Label>
<br />
    <asp:Label ID="lblMessage" runat="server" Text="" Font-Names="Arial" ForeColor="Red"></asp:Label>
</p>

</div>
    <p>
        &nbsp;</p>
    </form>
</body></html>
