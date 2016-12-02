/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.service.impl;

import com.amar.cellstation.entity.Category;
import com.amar.cellstation.entity.dao.CategoryDAO;
import com.amar.cellstation.service.CategoryService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amar
 */@Service (value="CategoryService")
public class CategoryServiceImpl implements CategoryService {
    
     @Autowired
     private CategoryDAO categoryDAO;
     
    @Override
    public List<Category> getALL() throws SQLException {
       return categoryDAO.getALL();
    }

    @Override
    public int insert(Category c) throws SQLException {
       return categoryDAO.insert(c);
    }

    @Override
    public int update(Category c) throws SQLException {
        return categoryDAO.update(c);
    }

    @Override
    public int delete(int catid) throws SQLException {
        return categoryDAO.delete(catid);
    }

    @Override
    public Category getById(int catid) throws SQLException {
       return categoryDAO.getById(catid);
    }
    
}
