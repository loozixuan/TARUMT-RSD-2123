<%@ Page Language="C#" MasterPageFile="~/Practical2LabExercise.Master" AutoEventWireup="true" CodeBehind="CarSticker.aspx.cs" Inherits="Practical2LabExercise.CarSticker" %>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
        <div>
            <table style="width: 100%;">
                <tr>
                    <td class="auto-style8">Student Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :</td>
                    <td class="auto-style9">
                        <asp:TextBox ID="txtName" runat="server" Height="31px" Width="248px"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style7">Student ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :</td>
                    <td class="auto-style2">
                        <asp:TextBox ID="txtID" runat="server" Height="32px" Width="245px"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style7">Joined Date&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :</td>
                    <td class="auto-style2">
                        <asp:TextBox ID="txtDate" runat="server" TextMode="Date"></asp:TextBox>
                    </td>
                </tr>
                 <tr>
                    <td class="auto-style7">Gender&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :</td>
                    <td class="auto-style2">
                        <asp:RadioButtonList ID="rbGender" runat="server" OnSelectedIndexChanged="RadioButtonList1_SelectedIndexChanged" Width="97px">
                            <asp:ListItem>male</asp:ListItem>
                            <asp:ListItem>female</asp:ListItem>
                        </asp:RadioButtonList>
                     </td>
                </tr>
                <tr>
                    <td class="auto-style7">Programmed&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :</td>
                    <td class="auto-style2">
                        <asp:DropDownList ID="ddlProg" runat="server">
                            <asp:ListItem>RIS</asp:ListItem>
                            <asp:ListItem>RSD</asp:ListItem>
                            <asp:ListItem>RIT</asp:ListItem>
                            <asp:ListItem>RSF</asp:ListItem>
                            <asp:ListItem>REI</asp:ListItem>
                        </asp:DropDownList>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style7">Year of study&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :</td>
                    <td class="auto-style2">
                        <asp:TextBox ID="txtYearOfStudy" runat="server" Height="31px" Width="245px" TextMode="Number" min="1" max="5"></asp:TextBox>
                    </td>
                </tr>
                 <tr>
                    <td class="auto-style7">Vehicle Registration Number&nbsp;&nbsp;&nbsp;&nbsp; :</td>
                    <td class="auto-style2">
                        <asp:TextBox ID="txtRegNo" runat="server" Height="30px" Width="242px"></asp:TextBox>
                     </td>
                </tr>
                <tr>
                    <td class="auto-style7">Vehicle&#39;s Type&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :</td>
                    <td class="auto-style2">
                        <asp:DropDownList ID="ddlVehicleType" runat="server">
                            <asp:ListItem>sedan</asp:ListItem>
                            <asp:ListItem>coupe</asp:ListItem>
                            <asp:ListItem>sports car</asp:ListItem>
                            <asp:ListItem>minivan</asp:ListItem>
                        </asp:DropDownList>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style6"></td>
                    <td>
                        <asp:Button ID="btnSubmit" runat="server" Text="Submit" OnClick="btnSubmit_Click" /></td>
                </tr>
            </table>
        </div>
        <p>
            <asp:Label ID="lblMsg" runat="server" Text="Label"></asp:Label>
        </p>
</asp:Content>
<asp:Content ID="Content2" runat="server" contentplaceholderid="head">
    <style type="text/css">
        .auto-style6 {
            width: 570px;
        }
        .auto-style7 {
            height: 34px;
            width: 570px;
        }
        .auto-style8 {
            width: 600px;
            height: 111px;
        }
        .auto-style9 {
            width: 100%;
            height: 111px;
        }
    </style>
</asp:Content>
