<%@ Page Language="C#" MasterPageFile="~/03_DefaultMaster.master" AutoEventWireup="true" Inherits="Login" Title="Untitled Page" Codebehind="Login.aspx.cs" %>
<%@ Register TagPrefix="LoginContainer" TagName="loginControl" Src="~/LoginControl.ascx" %>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <div class="leftColumn">
    <p align="center" style="margin-top:20px;">  
        <!-- Place your LoginControl here -->
        <LoginContainer:loginControl runat="server" />
    </p>
    
</div>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="contentAd" Runat="Server">
</asp:Content>

