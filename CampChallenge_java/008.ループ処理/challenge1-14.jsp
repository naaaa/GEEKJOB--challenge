<%-- 
    Document   : challenge1-14
    Created on : 2018/05/30, 14:07:04
    Author     : itounanako
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int total;total=0;
for(int i=0;i<=100;i++){
    total=total+i;
}
out.print(total);
%>