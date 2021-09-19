<%@ Control Language="C#" AutoEventWireup="true" CodeBehind="Labels.ascx.cs" Inherits="Prac8.Labels" %>
<div style="background:#BCDEFF;padding:5px;">
    <p>
        You logged on as
    <b><asp:Label ID="lblUsername" runat="server"></asp:Label></b>
    </p>
    <p>
        You logged on at
        <b><asp:Label ID="lblLoginTime" runat="server"></asp:Label></b>
    </p>
    <asp:LoginStatus ID="LoginStatus1" runat="server" />
</div>
