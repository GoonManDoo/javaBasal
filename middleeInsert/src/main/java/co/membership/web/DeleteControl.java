package co.membership.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.membership.service.MemberService;

public class DeleteControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num = request.getParameter("num");
		
		if(num.isEmpty()) {
			request.setAttribute("error", "상품번호를 입력하세요.");
			request.getRequestDispatcher("view/delete.jsp").forward(request, response);
			return;
		}
		
		
		
		MemberService service = new MemberService();
		service.deleteMember(num);
		
		request.setAttribute("num", num);
		
		request.getRequestDispatcher("result/deleteOutput.jsp").forward(request, response);
	}

}
