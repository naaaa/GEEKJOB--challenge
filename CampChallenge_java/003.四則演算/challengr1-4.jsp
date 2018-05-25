<%-- 
    Document   : challengr1-4
    Created on : 2018/05/25, 14:11:39
    Author     : itounanako
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

final int BASE=200;
int num=10;

// 足し算
int tasu=BASE+num;

// 引き算
int hiku=BASE-num;

// 掛け算
int kake=BASE*num;

// 割り算
int wari=BASE/num;

// 剰余斬
int amari=BASE%5;

out.print(++tasu);
out.print(hiku++);
out.print(--kake);
out.print(wari--);
out.print(++amari+num);

%>