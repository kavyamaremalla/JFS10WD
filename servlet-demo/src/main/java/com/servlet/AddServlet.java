package com.servlet;

import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

//    public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//       int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//
//        resp.getWriter().print(num1 + num2);
//
//        System.out.println(num1 + num2);
//    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String requestBody = getRequestBody(req);
        System.out.println(requestBody);

        resp.getWriter().print("<h1>Hello</h1>");
    }

    public String getRequestBody(HttpServletRequest req) throws IOException {

        StringBuilder requestBody = new StringBuilder();
        ServletInputStream inputStream = req.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();

        while (line != null){
            requestBody.append(line);
            line = bufferedReader.readLine();
        }

        return requestBody.toString();
    }
}
