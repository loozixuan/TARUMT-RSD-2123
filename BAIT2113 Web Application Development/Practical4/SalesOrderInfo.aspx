<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="SalesOrderInfo.aspx.cs" Inherits="Prac4LabExercise.SalesOrderInfo" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .auto-style2 {
            height: 26px;
            width: 472px;
        }
        .auto-style3 {
            width: 472px;
        }
        .auto-style4 {
            height: 26px;
            width: 592px;
        }
        .auto-style5 {
            width: 592px;
        }
        .auto-style6 {
            width: 61%;
        }
        .auto-style7 {
            width: 492px;
        }
        .auto-style8 {
            width: 65%;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <div style="font-size: large; font-weight: bold">Sales Order Information By Staff.</div><br />
            <br />
            <table class="auto-style6">
                <tr>
                    <td class="auto-style2">Please select staff name:</td>
                    <td class="auto-style4">Please select year</td>
                </tr>
                <tr>
                    <td class="auto-style3">
                        <asp:DropDownList ID="ddlName" runat="server" DataSourceID="SqlDataSource3" DataTextField="FullName" DataValueField="FullName" Height="19px">
                        </asp:DropDownList>
                    </td>
                    <td class="auto-style5">
                        <asp:RadioButtonList ID="rbYear" runat="server" DataSourceID="SqlDataSource4" DataTextField="Column1" DataValueField="Column1" RepeatDirection="Horizontal">
                        </asp:RadioButtonList>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style3">
                        <asp:SqlDataSource ID="SqlDataSource3" runat="server" ConnectionString="<%$ ConnectionStrings:ConnectionString %>" SelectCommand="SELECT [LastName], [firstName], firstName+' '+LastName AS FullName FROM [Employees]"></asp:SqlDataSource>
                        <asp:SqlDataSource ID="SqlDataSource4" runat="server" ConnectionString="<%$ ConnectionStrings:ConnectionString %>" SelectCommand="SELECT DISTINCT YEAR(ORDERDATE) FROM ORDERS"></asp:SqlDataSource>
                    </td>
                    <td class="auto-style5">
                        <asp:Button ID="btnSearch" runat="server" Text="Search" OnClick="btnSearch_Click" />
                    </td>
                </tr>
            </table>
            <hr />
            <asp:Label ID="lblTitleGridView" runat="server" Text="lblTitleGridView"></asp:Label>
            <br />
            <br />
            <table class="auto-style8">
                <tr>
                    <td class="auto-style7">
                        <asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False" BackColor="White" BorderColor="#CCCCCC" BorderStyle="None" BorderWidth="1px" CellPadding="3" DataKeyNames="OrderID" DataSourceID="SqlDataSource1" AllowPaging="True" AllowSorting="True" OnSelectedIndexChanged="GridView1_SelectedIndexChanged">
                            <Columns>
                                <asp:CommandField ShowSelectButton="True" />
                                <asp:BoundField DataField="OrderID" HeaderText="OrderID" InsertVisible="False" ReadOnly="True" SortExpression="OrderID" />
                                <asp:BoundField DataField="OrderDate" HeaderText="OrderDate" SortExpression="OrderDate" />
                            </Columns>
                            <FooterStyle BackColor="White" ForeColor="#000066" />
                            <HeaderStyle BackColor="#006699" Font-Bold="True" ForeColor="White" />
                            <PagerStyle BackColor="White" ForeColor="#000066" HorizontalAlign="Left" />
                            <RowStyle ForeColor="#000066" />
                            <SelectedRowStyle BackColor="#669999" Font-Bold="True" ForeColor="White" />
                            <SortedAscendingCellStyle BackColor="#F1F1F1" />
                            <SortedAscendingHeaderStyle BackColor="#007DBB" />
                            <SortedDescendingCellStyle BackColor="#CAC9C9" />
                            <SortedDescendingHeaderStyle BackColor="#00547E" />
                           
                        </asp:GridView>
                        <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:ConnectionString %>" SelectCommand="SELECT O.OrderID, O.OrderDate FROM Orders AS O INNER JOIN Employees AS E ON O.EmployeeID = E.EmployeeID WHERE (E.FirstName + ' ' + E.LastName = @name) AND (YEAR(O.OrderDate) = @date)">
                            <SelectParameters>
                                <asp:ControlParameter ControlID="ddlName" Name="name" PropertyName="SelectedValue" />
                                <asp:ControlParameter ControlID="rbYear" Name="date" PropertyName="SelectedValue" />
                            </SelectParameters>
                        </asp:SqlDataSource>
                    </td>
                    <td>
                        <asp:Label ID="lblOldSales" runat="server" Text="lblOldSales"></asp:Label>
                        <asp:SqlDataSource ID="SqlDataSource2" runat="server" ConnectionString="<%$ ConnectionStrings:ConnectionString %>" SelectCommand="SELECT P.ProductName, OD.UnitPrice, OD.Quantity, OD.Discount, (OD.UnitPrice*OD.Quantity-OD.Discount) AS SALES FROM [Order Details] AS OD INNER JOIN Products AS P ON OD.ProductID = P.ProductID WHERE (OD.OrderID = @orderid)">
                            <SelectParameters>
                                <asp:ControlParameter ControlID="GridView1" Name="orderid" PropertyName="SelectedValue" />
                            </SelectParameters>
                        </asp:SqlDataSource>
                        <br />
                        <asp:DataList ID="dlProdInfo" runat="server" CellPadding="4" DataSourceID="SqlDataSource2" ForeColor="#333333">
                            <AlternatingItemStyle BackColor="White" />
                            <FooterStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                            <HeaderStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                            <ItemStyle BackColor="#EFF3FB" />
                            <ItemTemplate>
                                ProductName:
                                <asp:Label ID="ProductNameLabel" runat="server" Text='<%# Eval("ProductName") %>' />
                                <br />
                                UnitPrice:
                                <asp:Label ID="UnitPriceLabel" runat="server" Text='<%# Eval("UnitPrice") %>' />
                                <br />
                                Quantity:
                                <asp:Label ID="QuantityLabel" runat="server" Text='<%# Eval("Quantity") %>' />
                                <br />
                                Discount:
                                <asp:Label ID="DiscountLabel" runat="server" Text='<%# Eval("Discount") %>' />
                                <br />
                                SALES:
                                <asp:Label ID="SALESLabel" runat="server" Text='<%# Eval("SALES") %>' />
                                <br />
                                <br />
                            </ItemTemplate>
                            <SelectedItemStyle BackColor="#D1DDF1" Font-Bold="True" ForeColor="#333333" />
                        </asp:DataList>
                    </td>
                </tr>
            </table>
            <br />
            <br />
        </div>
    </form>
</body>
</html>
