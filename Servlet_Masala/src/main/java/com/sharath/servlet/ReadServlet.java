package com.sharath.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.sharath.dto.MasalaDto;
import com.sharath.repo.MasalaRepoImpl;


public class ReadServlet extends HttpServlet {
	
	MasalaRepoImpl repo = new MasalaRepoImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter write = response.getWriter();
		List<MasalaDto> all = repo.readAll();
		for(MasalaDto d : all)
		{
			write.print("<b>"+d+"</b><br><br>");
			
		}
		write.print("<br><a href = welcome.jsp>click here to go to main page");
		
	}

	

}
