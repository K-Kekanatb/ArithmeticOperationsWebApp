/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author khuts
 */
public class DivisionServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer num1 = Integer.parseInt(request.getParameter("num1"));
        Integer num2 = Integer.parseInt(request.getParameter("num2"));
        
        ArithmeticOperationsInterface aoi = new ArithmeticOperationsManager();
        int sum;
        try {
            sum = aoi.divide(num1, num2);
        } catch (NumberException ex) {
            throw new ServletException(ex); // wrap and rethrow to container
        }
        
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("sum", sum);
        
        RequestDispatcher rd = request.getRequestDispatcher("qoutient_outcome.jsp");
        rd.forward(request, response);
    }

    

}
