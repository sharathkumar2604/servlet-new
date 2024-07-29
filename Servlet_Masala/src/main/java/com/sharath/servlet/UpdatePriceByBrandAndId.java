package com.sharath.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.sharath.repo.MasalaRepoImpl;


public class UpdatePriceByBrandAndId extends HttpServlet {
	
	MasalaRepoImpl repo = new MasalaRepoImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		PrintWriter write = response.getWriter();
		String brand = request.getParameter("brand");
		String i = request.getParameter("id");
		String pric = request.getParameter("price");

		
		int id = Integer.parseInt(i);
		
		int price = Integer.parseInt(pric);

		
		
		if(repo.updatePriceByBrandAndId(price, brand, id))
		{
			write.print("<b>updated successfully</b>");
			write.print("<a href = welcome.jsp>click here to go to main page");
		}
		
		
		
	
	
	}
}
