package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// IOC : introversion of control
public class StudentServlet extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()호출");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");

		String method = req.getMethod();
		PrintWriter out = resp.getWriter(); // 출력스트림 생성
		if (method.equals("GET")) {
			out.print("<h3>Student Servlet page.</h3>");
			out.print("<h3>Get방식 호출</h3>");
		} else if (method.equals("POST")) {
			out.print("<h3>Post방식 호출</h3>");

		}
		// out.print("<a href='index.jsp</a>"); // ..을 쓰면 상위 폴더로 이동한다는 뜻
		out.print("<a href='./index.jsp?user_name=kildong&user_id=hong'>index page</a>"); // 파라메타 값 호출
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	public void destroy() {
		System.out.println("destroy() 호출.");
	}
}
