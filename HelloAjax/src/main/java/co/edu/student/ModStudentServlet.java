package co.edu.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class jModStudentServlet
 */
@WebServlet("/ajax/modStudentServlet")
public class ModStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ModStudentServlet() {
		super();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");

		String sNo = req.getParameter("a");
		String sName = req.getParameter("b");
		String eng = req.getParameter("c");
		String kor = req.getParameter("d");

		Student std = new Student();
		std.setStudentNo(Integer.parseInt(sNo));
		std.setEngScore(Integer.parseInt(eng));
		std.setKorScore(Integer.parseInt(kor));
		std.setStudentName(sName);

		StudentDAO dao = new StudentDAO();
		boolean success = dao.modifyStudent(std); // 수정하는 기능

		if (success) {
			// {"retCode":"OK",
			// "studentNo":studentNo,"studentName":"studentName","engScore":engScore,"korScore":korScore}
			resp.getWriter().println("{\"retCode\" : \"OK\", \"studentNo\":" + sNo + ", \"studentName\":\""
					+ sName + "\", \"engScore\":" + eng + ", \"korScore\":" + kor + "}");
		} else {
			resp.getWriter().println("{\"retCode\" : \"Fail\"}");
		}

	}
}
