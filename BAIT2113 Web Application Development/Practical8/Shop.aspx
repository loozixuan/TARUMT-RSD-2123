<%@ Page Language="C#" MasterPageFile="~/03_DefaultMaster.master" AutoEventWireup="true" Inherits="Shop" Title="Untitled Page" Codebehind="Shop.aspx.cs" %>
<%@ Register TagPrefix ="Prac8" TagName ="Test" Src="~/Labels.ascx"%>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    
    <!-- Place your Labels User Control here -->
        <Prac8:Test ID="ctlHeader" PageTitle="Prac 8" Runat = "server" />
    <br />
    <img alt="" src="Images/shopping.png" />
   
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="contentAd" Runat="Server">
</asp:Content>

