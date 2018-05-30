<%-- 
    Document   : challenge1-15
    Created on : 2018/05/30, 14:56:00
    Author     : itounanako
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int num;num=1000;
int i=0;
while(num>=100){
    i--;
    num=num/2;
}
out.print(num);

%>