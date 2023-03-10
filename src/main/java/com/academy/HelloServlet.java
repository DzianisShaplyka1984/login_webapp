package com.academy;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {

    PrintWriter writer = resp.getWriter();

    writer.println("<html>");
    writer.println("<body>");
    writer.println("Hello world!!!!");
    writer.println("</body>");
    writer.println("</html>");
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {

    PrintWriter writer = resp.getWriter();

    writer.println("<html>");
    writer.println("<body>");
    writer.println("Hello world!");
    writer.println("</body>");
    writer.println("</html>");
  }
}
