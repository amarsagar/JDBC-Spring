/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.service.impl;

import com.amar.cellstation.entity.Product;
import com.amar.cellstation.entity.dao.ProductDAO;
import com.amar.cellstation.service.ProductService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amar
 */
@Service(value="ProductService")

public class ProductServiceImpl implements ProductService{

    
     @Autowired
     private ProductDAO productDAO;
     
    @Override
    public List<Product> getALL() throws SQLException {
       return productDAO.getALL();
    }

    @Override
    public int insert(Product p) throws SQLException {
       return productDAO.insert(p);
    }

    @Override
    public int update(Product p) throws SQLException {
       return productDAO.update(p);
    }

    @Override
    public int delete(int pid) throws SQLException {
       return productDAO.delete(pid);
    }

    @Override
    public Product getById(int pid) throws SQLException {
        return productDAO.getById(pid);
    }
    
    
}
