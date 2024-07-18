
package com.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SuccessServlet extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        out.println("<h1>Success Servlet Invoked");
    }
}
