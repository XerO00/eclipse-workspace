    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
    <head>
    <meta charset="ISO-8859-1">
    
    <title>Insert title here</title>
    </head>
  
   
    <body>
<div style="position:relative;left:120px;top:0px;bottom:60px">
<a href="http://localhost:8080/OnlineQuiz/jsps/home.jsp" >Check Online exam page here </a>          </div>

<div style="position:relative;left:120px;top:0px;bottom:60px">

 	
		<div class="header">
		<h1>Login </h1> 
		<span></span>
		</div>
<form name="login-form" class="login-form" action="DemoHomeController" method="post">	
		<div class="content">
				<%
  System.out.println("Inside the forn and printing ");
%>	
	
		<input name="username" type="text" class="input username" placeholder="Username" />
		<div class="user-icon"></div>
		<input name="password" type="password" class="input password" placeholder="Password" />
		<div class="pass-icon"></div>		
		 </div>

		<div class="footer">
		<input type="submit" name="submit" value="Login" class="button" />
		</div>
		</form>
</div>
</body>

 </html>
    
    
    <%/**
      <body>
    Sample login Example (try with username as "admin" and password as "admin" without quart ) <br> <br>
    <form action="LoginController" method="post">
    Enter username :<input type="text" name="username"> <br>
    Enter password :<input type="password" name="password"><br>
    <input type="submit" value="Login">
    </form>
    </body> 
   **/ %>