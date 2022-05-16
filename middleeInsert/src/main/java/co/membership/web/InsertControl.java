package co.membership.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.membership.service.MemberService;
import co.membership.vo.MemberVO;

public class InsertControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String saveDir = "upload";
		saveDir = request.getServletContext().getRealPath(saveDir);
		int maxSize = 1024 * 1024 * 10;
		String encoding = "UTF-8";
		// multipart 요청.
		// request, 저장위치, 최대사이즈, 인코딩, 리네임정책. file.jpg, file1.jpg
		MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding,
				new DefaultFileRenamePolicy());
		
		int number = Integer.parseInt(multi.getParameter("num"));
		String name = multi.getParameter("name");
		int price = Integer.parseInt(multi.getParameter("price"));
		String category = multi.getParameter("category");
		String comment = multi.getParameter("comment");
		int sale = Integer.parseInt(multi.getParameter("sale"));
		String pimg = multi.getParameter("pimg");
		String gender = multi.getParameter("gender");
		String email = multi.getParameter("email");
		
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
		System.out.println(pimg);
		MemberService service = new MemberService();
		service.insertMember(vo);
		
		
		// Dispatcher 객체 forward.
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

//	private ServletRequest getServletContext() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
