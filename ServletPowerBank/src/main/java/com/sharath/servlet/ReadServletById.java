package com.sharath.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.sharath.dto.PowerBankDto;
import com.sharath.service.PowerBankService;
import com.sharath.service.PowerBankServiceImpl;

public class ReadServletById extends HttpServlet {

	PowerBankService service = new PowerBankServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter write = response.getWriter();
		try {

			PowerBankDto id = (PowerBankDto) service.readById(request.getParameter("id"));
			write.print("<b>" + id + "</b><br>");

			write.print("<b>Go To Main page<a href=main.jsp>click here</b>");
		} catch (Exception e) {
			e.printStackTrace();
			write.print("<font color= red> <b>your datebase is empty</b>");
			write.print("<b>Go To Main page<a href=main.jsp>click here</b>");
		}
	}

}
