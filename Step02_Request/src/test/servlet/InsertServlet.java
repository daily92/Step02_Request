package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class InsertServlet extends 	HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// POST 방식 전송 인코딩 설정 (한글 안 깨지게!)
		request.setCharacterEncoding("utf-8");
		
		// 폼 전송 되는 name, addr 을 추출해서 콘솔창에 출력하고
		String name= request.getParameter("name");
		String addr= request.getParameter("addr");
		
			//지금은 console 창에 출력하지만, DB 연동할 준비되면 DB 에 출력할 거
		System.out.println("name: "+name);
		System.out.println("addr: "+addr);
		
		// 클라이언트에게 insert ok~ 문자열을 출력해 보세요.
		PrintWriter pw = response.getWriter();
		pw.print("insert ok~");
	}
}
