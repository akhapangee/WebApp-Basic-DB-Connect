/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.webapp.servlet;

import com.akhilesh.webapp.dao.CustomerDAO;
import com.akhilesh.webapp.dao.impl.CustomerDAOImpl;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Akhilesh
 */
public class DefaultServlet extends HttpServlet {
    private  CustomerDAO customerDAO = new CustomerDAOImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setAttribute("customers", customerDAO.getAll());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DefaultServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        request.setAttribute("test", "Tes Again Akhilesh");
        request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
    }

   
    
}
