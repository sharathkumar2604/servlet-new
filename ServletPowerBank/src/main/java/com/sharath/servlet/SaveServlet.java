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

public class SaveServlet extends HttpServlet {

	PowerBankService service = new PowerBankServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter write = response.getWriter();

		String name = request.getParameter("name");
		String mah = request.getParameter("mah");

		String materialType = request.getParameter("materialType");
		String price = request.getParameter("price");

		PowerBankDto dto = new PowerBankDto(name, mah, materialType, price);

		boolean save = service.save(dto);

		if (save) {
			write.print("<b> saved successfully</b><br><br>");
			write.print("<b>Go To Main Page<a href=main.jsp>click here<b><br>");

		} else {
			write.print("<b><font color=red >saved unsuccessfully</b><br><br>");
			write.print("<b>Go To Main Page<a href=main.jsp>click here<b><br><br>");
		}

	}

}
