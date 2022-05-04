package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberDeleteControl implements Control  {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// 넘어오는 파라메타
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String passwd = request.getParameter("passwd");
		String email = request.getParameter("email");
		if(id.isEmpty()) {
			request.setAttribute("error", "ID를 입력하세요.");
			request.getRequestDispatcher("memberView/memberDelete.jsp").forward(request, response);
			return;
		}
		
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setName(name);
		member.setEmail(email);
		member.setPasswd(passwd);
		
		MemberService service = new MemberService();
		service.memberDelete(id);
		
		request.setAttribute("id", id);
		
		request.getRequestDispatcher("memberResult/memberDeleteOutput.jsp").forward(request, response);
		
		
	}

}
