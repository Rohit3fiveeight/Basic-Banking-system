package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.RegisterService;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
			int accountId=Integer.parseInt(request.getParameter("account_id"));
	        String name=request.getParameter("user_name");
	        String email=request.getParameter("user_email");
	        String balance1=request.getParameter("user_balance");
	        int balance =Integer.parseInt(balance1);
	        out.println(name);
            out.println(email);
            out.println(balance);
            boolean count = RegisterService.processRegisrteration(name,email,balance,accountId);
	        if(count)
            {
                //if data saved successfully...
                out.println("done");
                response.sendRedirect("index.jsp");                   
            }
            else
            {
                //error occur
                out.println("error"); 
            }
	        out.println("<h1>Servlet registerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
			int accountId=Integer.parseInt(request.getParameter("account_id"));
	        String name=request.getParameter("user_name");
	        String email=request.getParameter("user_email");
	        String balance1=request.getParameter("user_balance");
	        int balance =Integer.parseInt(balance1);
	        out.println(name);
            out.println(email);
            out.println(balance);
            boolean count = RegisterService.processRegisrteration(name,email,balance,accountId);
	        if(count)
            {
                //if data saved successfully...
                out.println("done");
                response.sendRedirect("index.jsp");                   
            }
            else
            {
                //error occur
                out.println("error"); 
            }
	        out.println("<h1>Servlet registerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
	}

}
