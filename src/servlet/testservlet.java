package servlet;

import dao.*;
import entity.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "testservlet", value = "/src/servlet/testservlet")
public class testservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String str = "qwer";
        char[] c= str.toCharArray();
        System.out.println(c.length);
        System.out.println(c[0]);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request,response);
    }
}
