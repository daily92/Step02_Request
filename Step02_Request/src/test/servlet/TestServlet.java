package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 메소드를 읽어와 본다.
		String method= request.getMethod();
		// 콘솔에 출력
		System.out.println("method: "+ method);
		
		// GET 방식 요청 파라미터 추출
			//test?name=white 에서 white 문자열을 String type 으로 얻어오는 것
			// <GET 방식 걸 때, 서버에 문자열 요청하는 방법!> 링크 걸 때	?파라미터명=
			// request.getParameter("파라미터명")
		String name= request.getParameter("name");
		// 콘솔에 출력	
		System.out.println("name: "+ name);
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		PrintWriter pw = response.getWriter();
		pw.println("<doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'/>");
		pw.println("<title> </title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.print("ok!");
		pw.println("</body>");
		pw.println("</html>");
	}
}
