package com.sharath.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.sharath.service.PowerBankService;
import com.sharath.service.PowerBankServiceImpl;


public class DeleteByNamePriceAnMah extends HttpServlet {
	PowerBankService service = new PowerBankServiceImpl();
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("dskns");
		PrintWriter write = response.getWriter();

		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String mah = request.getParameter("mah");
		

		boolean b = service.deleteByNamePriceAndMah(name, price, mah);

		if (b) {
			write.print("<b> deleted successfully</b><br><br>");
			write.print("<b>Go To Main Page<a href=main.jsp>click here<b><br>");

		} else {
			write.print("<b><font color=red >failed deletion!</b><br><br>");
			write.print("<b>Go To Main Page<a href=main.jsp>click here<b><br><br>");
		}

	}

}
