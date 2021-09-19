<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Product.aspx.cs" Inherits="Prac4LabExercise.Product" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <div>
                Search Product Information Based on Category Name</div>
            <br />
            Select a category name:
            <asp:DropDownList ID="ddlCategory" runat="server" DataSourceID="SqlDataSource1" DataTextField="CategoryName" DataValueField="CategoryName">
            </asp:DropDownList>
            <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:ConnectionString %>" SelectCommand="SELECT [CategoryName] FROM [Categories]"></asp:SqlDataSource>
            <asp:Button ID="btnFind" runat="server" Text="Find" OnClick="btnFind_Click" />
&nbsp;<br />
            <hr />
            Your search return:
            <asp:Label ID="lblResult" runat="server"></asp:Label>
&nbsp;record<br />
            <br />
            <asp:Repeater ID="Repeater1" runat="server" OnItemCommand="Repeater1_ItemCommand">
                <ItemTemplate>
                    <div>Product Name:  <%#Eval("ProductName")%> </div>
                    <div>Unit Price:  <%#Eval("UnitPrice")%> </div> <br />
                </ItemTemplate>
            </asp:Repeater>
            <br />
        </div>
    </form>
</body>
</html>
