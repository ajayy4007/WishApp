package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WishMessageServlet extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException{
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	LocalDateTime ldt= LocalDateTime.now();
	int hour=ldt.getHour();
	pw.println("<img src='images/wish.png;widht=50px;hight=50px'><h1 style='color:red;text-align:center'>"+ldt.toString()+"</h1>");
	if(hour<12)
		pw.println("<h1 style='color:orange;text-align:center'>Good Morning</h1>");
	else if(hour<16)
		pw.println("<h1 style='color:green;text-align:center'>Good AfterNoon</h1>");
	else if(hour<20) 
		pw.println("<h1 style='color:pink;text-align:center'>Good Evening</h1>");
	else
		pw.println("<h1 style='color:pink;text-align:center'>Good Night</h1>");
	pw.println("<br> <a href='http://localhost:8089/WishApp/page.html'>home</a>");
	pw.close();
	}
}
