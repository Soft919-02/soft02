package servlet;

import dao.Init;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "initServlet", value = "/src/servlet/initServlet")
public class initServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        Init.create();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        doGet(request,response);
    }
}
