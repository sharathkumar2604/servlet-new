package com.sharath.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.sharath.dto.MasalaDto;
import com.sharath.repo.MasalaRepoImpl;


public class ReadByQty extends HttpServlet {
	
	MasalaRepoImpl repo= new MasalaRepoImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	PrintWriter write = response.getWriter();
	System.out.println("kjhkds");
	
	String qty = request.getParameter("qty");
	int qt = Integer.parseInt(qty);

	for(MasalaDto d : repo.readByQty(qt))
	{
		write.print("<b>"+d+"</b><br>");
	}
	write.print("<a href = welcome.jsp>click here to go to main page");
	}

}
