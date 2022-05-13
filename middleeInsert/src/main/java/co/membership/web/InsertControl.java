package co.membership.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.membership.service.MemberService;
import co.membership.vo.MemberVO;

public class InsertControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int number = Integer.parseInt(request.getParameter("num"));
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		String category = request.getParameter("category");
		String comment = request.getParameter("comment");
		int sale = Integer.parseInt(request.getParameter("sale"));
		String pimg = request.getParameter("pimg");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		
		MemberVO vo = new MemberVO();
		vo.setProDuctNum(number);
		vo.setProDuctName(name);
		vo.setProDuctPrice(price);
		vo.setCateGory(category);
		vo.setComment(comment);
		vo.setSale(sale);
		vo.setpImg(pimg);
		vo.setGender(gender);
		vo.setEmail(email);
		
		MemberService service = new MemberService();
		service.insertMember(vo);
		
		
		// Dispatcher 객체 forward.
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
