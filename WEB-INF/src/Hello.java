package com.rt;

import javax.servlet.*;
import java.io.*;

public class Hello extends GenericServlet
{

public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException
{

res.getWriter().println("Hello");

}
}

