package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 * Servlet implementation class Details
 */
@WebServlet("/Details")
public class Ddetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ddetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			
			
			SessionFactory factory = HibernateUtil.getSessionFactory(); //Take the SessionFactory Object from the Hibernate Util File.
			Session session = factory.openSession();
			
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			
			List<ClassReport> list=session.createQuery("from ClassReport").list();
		    out.println("-->Full Class Report<-- <br>");
		
			for(ClassReport p: list) {
				out.println(String.valueOf(p.getID()+"-->"+p.getRoll()+" "+"Student Name="+p.getStudent()+" "+"Studying@Class:"+p.getClasses()+" "+"subject taken:"+p.getSubject()+" "+"by Prof."+p.getTeacher()+"<br>"));
			}
			session.close();
			 out.println("<a href='logout'>Logout of session</a>");
			 out.println("<button> <--Click this link for logout </button>");
			out.println("</body></html>");
		}
		catch(Exception ex) {
			throw ex;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
