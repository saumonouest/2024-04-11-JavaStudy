<%@page import="org.jsoup.select.Elements"%>
<%@page import="org.jsoup.nodes.Document"%>
<%@page import="javax.print.Doc"%>
<%@page import="org.jsoup.Jsoup"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% //자바 
// <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	String[] poster=new String[50];
	String[] title=new String[50];

	try{
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
				
		Elements pp=doc.select("table.list-wrap a.cover img");
		Elements tt=doc.select("table.list-wrap a.title");
		for(int i=0;i<pp.size();i++){
			poster[i]=pp.get(i).attr("src");
			title[i]=tt.get(i).text();
		}
	}catch(Exception ex){}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.css">
</head>
<body>
<div class="container">
 <div class="row">
 <% for(String po:poster){
	 %>
  <div class="col-md-4">
    <div class="thumbnail">
      <a href="#">
        <img src="/<%=po%>" alt="Lights" style="width:100%">
        <div class="caption">
          <p></p>
        </div>
      </a>
    </div>
  </div>
  <%
  	}
 %>
</body>
</html>