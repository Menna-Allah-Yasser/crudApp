package com.example.crudapp;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       /* response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Hello from post");*/
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name=req.getParameter("name");
        String address=req.getParameter("address");
        out.println("name : " +name+ "  Address : "+address);

       // out.println("Hello from post");
        out.close();
    }




}