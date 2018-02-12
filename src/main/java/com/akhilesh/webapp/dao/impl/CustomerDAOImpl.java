/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.webapp.dao.impl;

import com.akhilesh.webapp.dao.CustomerDAO;
import com.akhilesh.webapp.entity.Customer;
import com.sun.javafx.geom.Curve;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Akhilesh
 */
public class CustomerDAOImpl implements CustomerDAO{

    @Override
    public List<Customer> getAll() throws ClassNotFoundException, SQLException {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Akhilesh", "Khapangee", "594545", true));
        customers.add(new Customer(2, "Ram", "Thapa", "5353", true));
        
        return customers;
    }
    
}
