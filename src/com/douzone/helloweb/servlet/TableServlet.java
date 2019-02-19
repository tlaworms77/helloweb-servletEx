package com.douzone.helloweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/table", "/t", "/tbl"})
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String row = request.getParameter("r");
		String col = request.getParameter("c");

		int nRow = (row != null) ? nRow = Integer.parseInt(row) : 1;
		int nCol = (col != null) ? nCol = Integer.parseInt(col) : 1;

		// 응답
		PrintWriter out = response.getWriter();
		
		out.println("<table border=1px cellspacing=0 cellpadding=5>");
		for (int i = 0; i < nRow; i++) {
			out.println("<tr>");
			for (int j = 0; j < nCol; j++) {
				out.print("<td>");
				out.print("cell(" + i + "," + j + ")");
				out.println("</td>");
			}
			out.println("</tr>");
		}
		out.println("</talbe>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
