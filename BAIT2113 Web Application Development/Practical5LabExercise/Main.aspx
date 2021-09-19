<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="Main.aspx.cs" Inherits="Practical5LabExercise.Main" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    This is the main page <br />
    <asp:LoginName ID="LoginName1" runat="server" FormatString="You are logged in as: {0}" />
<br />
<asp:LoginStatus ID="LoginStatus1" runat="server" />
<br />
<br />
</asp:Content>
