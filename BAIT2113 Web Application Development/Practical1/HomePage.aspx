<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="HomePage.aspx.cs" Inherits="Prac1.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
         <div>
            <asp:Label ID="Label1" runat="server" Text="Label">My Details:</asp:Label>

             <br />
             <br />

            <div>
                   Name: <asp:TextBox ID="txtName" runat="server"></asp:TextBox>
                   <br />
                   <br />
                   <asp:Label ID="lblDisplay" runat="server"></asp:Label>
                   <br />
                   <br />
            </div>
             
        </div>
         
            <div>
                <asp:Button ID="btnSubmit" runat="server" Text="Submit" OnClick="btnSubmit_Click1" />
            </div>
         </form>
</body>
</html>
