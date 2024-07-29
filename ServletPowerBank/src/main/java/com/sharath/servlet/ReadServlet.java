package com.sharath.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.sharath.dto.PowerBankDto;
import com.sharath.service.PowerBankService;
import com.sharath.service.PowerBankServiceImpl;


public class ReadServlet extends HttpServlet {
	
	
	PowerBankService service = new PowerBankServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter write = response.getWriter();
		try {
		for(PowerBankDto d :service.readAll())
		{
			write.print("<b>"+d+"</b><br>");
		}
		write.print("<b>Go to main page <a href=main.jsp> click here ></b><br>");
		write.print("<b><a href=save.jsp> <font color=green>Go To Save page </a></b> <br>");
	}
		catch (Exception e) {
			
			write.print("<b><font color= red>details empty in data base<a href=save.jsp>click here </b><br>");
			write.print("<b>Go to main page <a href=main.jsp > click here</b><br>");
		}
		}

}
