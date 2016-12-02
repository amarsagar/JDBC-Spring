/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.entity.dao;

import com.amar.cellstation.entity.Category;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author amar
 */
public interface CategoryDAO {
     
    List<Category> getALL()throws SQLException;
    int insert (Category c) throws SQLException;
    int update (Category c) throws SQLException;
    int delete (int catid) throws SQLException;
    Category getById (int catid) throws SQLException;
}
