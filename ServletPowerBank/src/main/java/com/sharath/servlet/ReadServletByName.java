package com.sharath.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.sharath.dto.PowerBankDto;
import com.sharath.service.PowerBankService;
import com.sharath.service.PowerBankServiceImpl;

public class ReadServletByName extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	PowerBankService service = new PowerBankServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter write = response.getWriter();
		try {

			System.out.println("f");
			List<PowerBankDto> byName = service.readByName(request.getParameter("name"));

			write.print("<b>" + byName + "</b><br>");

			write.print("<b>Go To Main page<a href=main.jsp>click here</b>");
		} catch (Exception e) {
			e.printStackTrace();
			write.print("<font color= red> <b>your datebase is empty</b>");
			write.print("<b>Go To Main page<a href=main.jsp>click here</b>");
		}
	}

}
