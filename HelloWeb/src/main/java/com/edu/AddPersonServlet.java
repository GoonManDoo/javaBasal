package com.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addPersonServlet")
public class AddPersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddPersonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
//        doGet(request, response);
		String id = request.getParameter("uid");//
		String name = request.getParameter("uname");
		String score = request.getParameter("uscore");
		String age = request.getParameter("uage");
		
		System.out.println("아이디: " + id);
		System.out.println("이름: " + name);
		System.out.println("점수: " + score);
		System.out.println("나이: " + age);
		
		// db insert/update/delte/select
		
		PrintWriter out = response.getWriter(); // InputStream(입력스트림 바이트단위), OutStream(출력스트림 바이트단위), Reader(문자단위 입력), Writer(문자단위 출력)
		out.println("<h3>응답결과</h3>");
		out.println("<h4>입력아이디 : " + id + "</h4>");
		out.println("<h4>입력이름 : " + name + "</h4>");
		out.println("<h4>입력점수 : " + score + "</h4>");
		out.println("<h4>나이 : " + age + "</h4>");
		
	}

}
