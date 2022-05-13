package co.membership.web;

import java.io.IOException;
import java.util.List;

import javax.naming.ldap.Control;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.membership.service.MemberService;
import co.membership.vo.MemberVO;



public class ListMemberController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		MemberService service = new MemberService();
		List<MemberVO> list = service.memberList();

		request.setAttribute("all", list);

		request.getRequestDispatcher("result/listOutput.jsp").forward(request, response);

	}

}