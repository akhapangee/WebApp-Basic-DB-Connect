/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.webapp.dao;

import com.akhilesh.webapp.entity.Customer;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Akhilesh
 */
public interface CustomerDAO {
    List<Customer> getAll() throws ClassNotFoundException, SQLException;
}
