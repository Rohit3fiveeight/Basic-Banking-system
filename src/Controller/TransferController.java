package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Pojo.Message;
import Service.TransferService;

/**
 * Servlet implementation class TransferController
 */
@WebServlet("/TransferController")
public class TransferController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransferController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");
	        try (PrintWriter out = response.getWriter()) {
	            /* TODO output your page here. You may use following sample code. */
                    String transferfrom=request.getParameter("transferfrom");
                    String transferto=request.getParameter("transferto");
                   // String balance1=request.getParameter("user_balance");
                    int amount =Integer.parseInt(request.getParameter("amount"));
                    //out.println("rtry"+transferfrom);
                    //out.println(transferto);
                    //out.println(amount);
                    int p = TransferService.processTranfer(transferfrom,transferto,amount);
                    if(p==1)
                    {
                        Message msg=new Message("Transaction Done Sucessfully ","success","alert-success");
                        response.sendRedirect("transfer.jsp");
                        HttpSession s=request.getSession();
                        s.setAttribute("msg",msg);
                        // response.sendRedirect("index.jsp");
                    }
                    else if(p==2)
                    {
                        Message msg=new Message("Transferring Amuont couldn't not be negative ","error","alert-danger");
                        response.sendRedirect("transfer.jsp");
                        HttpSession s=request.getSession();
                        s.setAttribute("msg",msg);
                    }
                    else if(p==3)
                    {
                        Message msg=new Message("Transferring Amuont couldn't not be equal to Zero ","error","alert-danger");
                        response.sendRedirect("transfer.jsp");
                        HttpSession s=request.getSession();
                        s.setAttribute("msg",msg);
                    }     
                     else if(p==4)
                    {
                        Message msg=new Message("Account have Insuffiecent Balance ","error1","alert-danger");
                        response.sendRedirect("transfer.jsp");
                        HttpSession s=request.getSession();
                        s.setAttribute("msg",msg);
                    }  
            
            
            
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
	            /* TODO output your page here. You may use following sample code. */
	                    String transferfrom=request.getParameter("transferfrom");
	                    String transferto=request.getParameter("transferto");
	                   // String balance1=request.getParameter("user_balance");
	                    int amount =Integer.parseInt(request.getParameter("amount"));
	                    out.println("rtry"+transferfrom);
	                    out.println(transferto);
	                    out.println(amount);
	                    int p = TransferService.processTranfer(transferfrom,transferto,amount);
	                    if(p==1)
	                    {
	                        Message msg=new Message("Transaction Done Sucessfully ","success","alert-success");
	                        response.sendRedirect("transfer.jsp");
	                        HttpSession s=request.getSession();
	                        s.setAttribute("msg",msg);
	                        // response.sendRedirect("index.jsp");
	                    }
	                    else if(p==2)
	                    {
	                        Message msg=new Message("Transferring Amuont couldn't not be negative ","error","alert-danger");
	                        response.sendRedirect("transfer.jsp");
	                        HttpSession s=request.getSession();
	                        s.setAttribute("msg",msg);
	                    }
	                    else if(p==3)
	                    {
	                        Message msg=new Message("Transferring Amuont couldn't not be equal to Zero ","error","alert-danger");
	                        response.sendRedirect("transfer.jsp");
	                        HttpSession s=request.getSession();
	                        s.setAttribute("msg",msg);
	                    }     
	                     else if(p==4)
	                    {
	                        Message msg=new Message("Account have Insuffiecent Balance ","error1","alert-danger");
	                        response.sendRedirect("transfer.jsp");
	                        HttpSession s=request.getSession();
	                        s.setAttribute("msg",msg);
	                    }  
	            
	            
	            
	            out.println("</body>");
	            out.println("</html>");
	        }
	}

}
