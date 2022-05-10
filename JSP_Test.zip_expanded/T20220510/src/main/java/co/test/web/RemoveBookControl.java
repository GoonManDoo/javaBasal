package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.service.BookService;
import co.test.vo.BookVO;

public class RemoveBookControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String press = request.getParameter("press");
		int price = Integer.parseInt(request.getParameter("price"));
		if(code.isEmpty()) {
			request.setAttribute("error", "CODE를 입력하세요.");
			request.getRequestDispatcher("view/remove.jsp").forward(request, response);
			return;
		}
		
		BookVO book = new BookVO();
		book.setBookCode(code);
		book.setBookTitle(title);
		book.setBookAuthor(author);
		book.setBookPress(press);
		book.setBookPrice(price);
		
		BookService service = new BookService();
		service.removeBook(code);
		
		request.setAttribute("code", code);
		
		request.getRequestDispatcher("result/removeOutput.jsp").forward(request, response);
	}

}
