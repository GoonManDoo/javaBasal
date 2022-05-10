package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import co.test.service.BookService;
import co.test.vo.BookVO;

public class ModifyBookControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 넘어오는 파라메타
		String code = request.getParameter("id");
		String title = request.getParameter("name");
		String author = request.getParameter("passwd");
		String press = request.getParameter("email");
		int price = Integer.parseInt(request.getParameter("price"));
		
		if(code.isEmpty() || title.isBlank() || author.isBlank() || press.isBlank()) {
			request.setAttribute("error", "모든 항목을 입력하세요.");
			request.getRequestDispatcher("view/modify.jsp").forward(request, response);
			return;
		}
		
		BookVO book = new BookVO();
		book.setBookCode(code);
		book.setBookTitle(title);
		book.setBookAuthor(author);
		book.setBookPress(press);
		book.setBookPrice(price);
		
		BookService service = new BookService();
		service.modifyBook(book);
		
		request.setAttribute("code", code);
		request.getRequestDispatcher("result/modifyOutput.jsp").forward(request, response);
	}

}
