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

public class UpdatePriceByNameAndMah extends HttpServlet {

	private static final long serialVersionUID = 1L;

	PowerBankService service = new PowerBankServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("kjsfk");
		PrintWriter write = response.getWriter();

		String price = request.getParameter("price");
		String name = request.getParameter("name");
		String mah = request.getParameter("mah");

		boolean b = service.updatePriceByNameAndMah(price, name, mah);

		if (b) {
			write.print("<b> updated successfully</b><br><br>");
			write.print("<b>Go To Main Page<a href=main.jsp>click here<b><br>");

		} else {
			write.print("<b><font color=red >failed updationn!</b><br><br>");
			write.print("<b>Go To Main Page<a href=main.jsp>click here<b><br><br>");
		}

	}

}
