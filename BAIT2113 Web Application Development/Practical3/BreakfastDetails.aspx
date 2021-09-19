<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="BreakfastDetails.aspx.cs" Inherits="Prac3Lab2.BreakfastDetails" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .auto-style1 {
            width: 154px;
        }
        .auto-style2 {
            width: 29%;
        }
        .auto-style3 {
            margin-left: 0px;
        }
        .auto-style6 {
            width: 685px;
        }
        .auto-style7 {
            width: 61%;
        }
        .auto-style8 {
            width: 333px;
            height: 26px;
        }
        .auto-style9 {
            text-align: center;
            width: 365px;
            height: 26px;
        }
        .auto-style10 {
            text-align: center;
            width: 685px;
            height: 26px;
        }
        #tableShown, #tableShown th,#tableShown td {
            border: 1px solid black !important;
            border-collapse: collapse !important;
        }
        .qtyInput {
            display:block;
            margin-left:auto;
            margin-right:auto;
        }
        .auto-style11 {
            width: 333px;
        }
        .auto-style12 {
            width: 365px;
        }
        .auto-style13 {
            width: 333px;
            height: 30px;
        }
        .auto-style14 {
            text-align: center;
            width: 365px;
            height: 30px;
        }
        .auto-style15 {
            width: 685px;
            height: 30px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <div style="font-size: xx-large; font-weight: bold">
                FLYING BREAKFAST.COM</div>
            <br />
            Order your breakfast online. Online order status starts 2.00am - 11am everyday.<br />
            <br />
            <table class="auto-style2">
                <tr>
                    <td class="auto-style1">Breakfast Set</td>
                    <td>
                        <asp:RadioButtonList ID="rbSet" runat="server" AutoPostBack="True" CssClass="auto-style3" OnSelectedIndexChanged="RadioButtonList1_SelectedIndexChanged">
                            <asp:ListItem>Set 1</asp:ListItem>
                            <asp:ListItem>Set 2</asp:ListItem>
                            <asp:ListItem>Set 3</asp:ListItem>
                        </asp:RadioButtonList>
                    </td>
                </tr>
            </table>
            <br />
            <br />
            <asp:Label ID="lblSetDetail" runat="server"></asp:Label>
            <br />
            <br />
            <table id="tableShown" class="auto-style7">
                <tr>
                    <td class="auto-style8"></td>
                    <td class="auto-style9">Quantity</td>
                    <td class="auto-style10">Total (RM)</td>
                </tr>
                <tr>
                    <td class="auto-style13">
                         <asp:CheckBox ID="chkboxSet1" runat="server"  Text="Set 1" />
                    </td>
                    <td class="auto-style14">
                        <asp:TextBox class="qtyInput" ID="txtSet1" runat="server" Width="45px"></asp:TextBox>
                    </td>
                    <td class="auto-style15">
                        <asp:Label ID="lblPriceSet1" runat="server"></asp:Label>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style11">
                        <asp:CheckBox ID="chkboxSet2" runat="server" Text="Set 2" />
                    </td>
                    <td class="auto-style12">
                        <asp:TextBox class="qtyInput" ID="txtSet2" runat="server" Width="42px"></asp:TextBox>
                    </td>
                    <td class="auto-style6">
                        <asp:Label ID="lblPriceSet2" runat="server"></asp:Label>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style11">
                        <asp:CheckBox ID="chkboxSet3" runat="server" Text="Set 3" />
                    </td>
                    <td class="auto-style12">
                        <asp:TextBox class="qtyInput" ID="txtSet3" runat="server" Width="43px"></asp:TextBox>
                    </td>
                    <td class="auto-style6">
                        <asp:Label ID="lblPriceSet3" runat="server"></asp:Label>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style11">&nbsp;</td>
                    <td class="auto-style12">Total (RM)</td>
                    <td class="auto-style6">
                        <asp:Label ID="lblTotalPrice" runat="server"></asp:Label>
                    </td>
                </tr>
            </table>
            <br />
            <asp:Button ID="btnCalcuate" runat="server" OnClick="btnCalcuate_Click" style="height: 29px" Text="Calculate" />
&nbsp;&nbsp;
            <asp:Button ID="btnCancel" runat="server" OnClick="btnCancel_Click" Text="Cancel" />
            <br />
            <br />
            <asp:Button ID="btnConfirm" runat="server" OnClick="btnConfirm_Click" Text="Confirm Order" style="height: 29px" />
            <br />
            <br />
            <asp:Label ID="lblError" runat="server"></asp:Label>
            <br />
        </div>
    </form>
</body>
</html>
