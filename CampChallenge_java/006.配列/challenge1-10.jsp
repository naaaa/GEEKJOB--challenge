<%-- 
    Document   : challenge1-10
    Created on : 2018/05/25, 17:49:10
    Author     : itounanako
--%>


<%@page import="java.util.ArrayList"%>

<%
ArrayList<String> datas =new ArrayList<String>();

datas.add("10");

datas.add("100");

datas.add("soeda");

datas.add("hayashi");

datas.add("-20");

datas.add("118");

datas.add("END");

datas.set(2,"33");

out.print(datas);

%>

