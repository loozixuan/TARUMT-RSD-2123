<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="ConfirmOrder.aspx.cs" Inherits="Prac3Lab2.ConfirmOrder" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <script src="js/scripts.js"></script>
</head>
<body onload="alert('This page is to confirm your breakfast order')">
    <form id="form1" runat="server">
        <div>
            This is confirm that you have ordered:<br />
            <br />
            <asp:Label ID="lblOrder" runat="server"></asp:Label>
            <br />
            <br />
            The time now is
            <asp:Label ID="lblTimeNow" runat="server"></asp:Label>
&nbsp;. You will receive your order within 25 minutes.<br />
            <br />
            We will reach at your doorstop before or at
            <asp:Label ID="lblReceiveTime" runat="server"></asp:Label>
            <br />
            <br />
            Thank you.<br />
        </div>
    </form>
       <script>
           //$(document).ready(function () {
          //     alert('This page is to confirm your breakfast order');
          //  });
       </script>
</body>
</html>
