<%-- 
    Document   : challenge1-11
    Created on : 2018/05/27, 19:24:47
    Author     : itounanako
--%>

<%@page import="java.util.HashMap"%>
<%
    
HashMap<String,String>data1=new HashMap<String,String>();

data1.put("1","AAA");

data1.put("hello","world");

data1.put("soeda","33");

data1.put("20","20");

out.println(data1.get("1"));

out.println(data1.get("hello"));

out.println(data1.get("soeda"));

out.println(data1.get("20"));

%>

