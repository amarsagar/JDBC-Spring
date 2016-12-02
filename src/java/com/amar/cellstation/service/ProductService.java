/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.service;

import com.amar.cellstation.entity.Product;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author amar
 */
public interface ProductService {
    
     List<Product> getALL() throws SQLException;
    int insert (Product p) throws SQLException;
    int update (Product p) throws SQLException;
    int delete (int pid)throws SQLException;
    Product getById(int pid)throws SQLException;
    
}
