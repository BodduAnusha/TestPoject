package fashionn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class Fashion extends  GenericServlet {
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String fname=req.getParameter("name");
		String fage=req.getParameter("age");
		pw.print(fname);
		pw.print(",Welcome to Fashion show");

	}
}
