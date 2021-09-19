<%@ Control Language="C#" AutoEventWireup="true" Inherits="LoginControl" Codebehind="LoginControl.ascx.cs" %>

    <table style="width: 80%; padding:5px 5px 5px 5px;">
        <tr>
            <td colspan="2">
                <b>Please Login</b></td>
        </tr>
        <tr>
            <td style="width: 92px">
                Username</td>
            <td>
                <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
            &nbsp;<asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" 
                    ErrorMessage="Please enter your username" ControlToValidate="TextBox1">*</asp:RequiredFieldValidator>
            </td>
        </tr>
        <tr>
            <td style="width: 92px">
                Password</td>
            <td>
                <asp:TextBox ID="TextBox2" runat="server" TextMode="Password"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" 
                    ErrorMessage="Please enter your password" 
                    ControlToValidate="TextBox2" Display="Dynamic">*</asp:RequiredFieldValidator>
                <asp:RegularExpressionValidator ID="RegularExpressionValidator1" runat="server" 
                    ControlToValidate="TextBox2" Display="Dynamic" 
                    ErrorMessage="Password must be 4 to 6 digits" ValidationExpression="\d{4,6}">*</asp:RegularExpressionValidator>
                <asp:CustomValidator ID="CustomValidator1" runat="server" Enabled="True" 
                    ErrorMessage="Invalid Username or Password" onservervalidate="Validate">*</asp:CustomValidator>
            </td>
        </tr>
        <tr>
        <td colspan="2">
            <asp:ValidationSummary ID="ValidationSummary1" runat="server" DisplayMode="List" ShowMessageBox="true" />
        </td>
        </tr>
        <tr>
            <td style="width: 92px">
                &nbsp;</td>
            <td>
                <asp:Button ID="Button1" runat="server" BackColor="#99CC00" Font-Bold="True" 
                    Font-Names="Calibri" Font-Size="Medium" ForeColor="Black" Text="Login" />
&nbsp;<asp:Button ID="Button2" runat="server" BackColor="#99CC00" Font-Bold="True" 
                    Font-Names="Calibri" Font-Size="Medium" ForeColor="Black" Text="Cancel" 
                    CausesValidation="False" />
            </td>
        </tr>
    </table>