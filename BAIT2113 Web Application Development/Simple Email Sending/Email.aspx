<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Email.aspx.cs" Inherits="EmailDemo.Email" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">  
<head runat="server">  
    <title></title>  
    <style type="text/css">  
        .style1  
        {  
            width: 106px;  
        }  
        .style2  
        {  
            text-decoration: underline;  
            font-size: large;  
            width: 257px;  
        }  
        .style3  
        {  
            width: 257px;  
        }  
    </style>  
</head>  
<body>  
    <form id="form1" runat="server">  
    <div>  
      
        <table style="width:100%;">  
            <tr>  
                <td class="style1">  
                     </td>  
                <td class="style2">  
                    <strong>Email Sytem using asp.net C#</strong></td>  
                <td>  
                     </td>  
            </tr>  
            <tr>  
                <td class="style1">  
                     </td>  
                <td class="style3">  
                     </td>  
                <td>  
                     </td>  
            </tr>  
            <tr>  
                <td class="style1">  
                    Email:</td>  
                <td class="style3">  
                    <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>  
                </td>  
                <td>  
                    <asp:RequiredFieldValidator ID="RequiredFieldValidator1"   
                        ControlToValidate="TextBox1" runat="server"   
                        ErrorMessage="Please Provide Email ID" Font-Bold="True" ForeColor="Red"></asp:RequiredFieldValidator>  
                  </td>  
            </tr>  
            <tr>  
                <td class="style1">  
                    Comment:</td>  
                <td class="style3">  
                    <asp:TextBox ID="TextBox2" runat="server" TextMode="MultiLine"></asp:TextBox>  
                </td>  
                <td>  
                     </td>  
            </tr>  
            <tr>  
                <td class="style1">  
                     </td>  
                <td class="style3">  
                     </td>  
                <td>  
                     </td>  
            </tr>  
            <tr>  
                <td class="style1">  
                    <asp:Label ID="lbmsg" runat="server"></asp:Label>  
                </td>  
                <td class="style3">  
                    <asp:Button ID="Button1" runat="server" onclick="Button1_Click"   
                        Text="Send Mail" />  
                </td>  
                <td>  
                     </td>  
            </tr>  
        </table>  
      
    </div>  
    </form>  
</body>  
</html>  
