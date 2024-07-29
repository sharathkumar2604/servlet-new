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

public class SaveServelt extends HttpServlet {

	MasalaRepoImpl repo = new MasalaRepoImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter write = response.getWriter();
		String i = request.getParameter("id");
		String brand = request.getParameter("brand");
		String type = request.getParameter("type");
		String qt = request.getParameter("qty");
		String pric = request.getParameter("price");

		
		int id = Integer.parseInt(i);
		
		int qty = Integer.parseInt(qt);
		int price = Integer.parseInt(pric);

		MasalaDto d = new MasalaDto(id,brand, type, qty, price);
		
		if(repo.save(d))
		{
			write.print("<b>saved successfully</b>");
			write.print("<a href = welcome.jsp>click here to go to main page");
		}
		
		
		
	}

}
