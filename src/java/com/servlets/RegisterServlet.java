
package com.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet
{
//    public void service(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
//    {
//        System.out.println("Servicing");
//    }
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        out.println("<h1>Welcome to Register Servlet</h1>");
        
        String name = req.getParameter("user_name");
        String password = req.getParameter("user_password");
        String email = req.getParameter("user_email");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_course");
        String condition = req.getParameter("condition");

        if(condition!=null)
        {
            if(condition.equals("checked"))
            {
                out.println("<h1>Name : "+name+"</h1>");
                out.println("<h1>password : "+password+"</h1>");
                out.println("<h1>email : "+email+"</h1>");
                out.println("<h1>gender : "+gender+"</h1>");
                out.println("<h1>course : "+course+"</h1>");
                
                RequestDispatcher rd = req.getRequestDispatcher("SuccessServlet");
            
                rd.forward(req,res);


            }
        }
        else{
            out.println("<h1>Terms and conditions not checked</h1>");
            //I want to include output of index.html
            
            //get the object of request dispatcher
            RequestDispatcher rd = req.getRequestDispatcher("index.html");
            
            rd.include(req,res);
        }
    }
}
