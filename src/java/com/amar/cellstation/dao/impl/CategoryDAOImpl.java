/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.dao.impl;

import com.amar.cellstation.constant.SQLConstant;
import com.amar.cellstation.entity.Category;
import com.amar.cellstation.entity.dao.CategoryDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author amar
 */

@Repository (value="CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

    @Autowired 
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<Category> getALL() throws SQLException {
       return jdbcTemplate.query(SQLConstant.CATEGORY_GETALL, new RowMapper<Category>() {

            @Override
            public Category mapRow(ResultSet rs, int i) throws SQLException {
             
               return mapData(rs);
            }
        });
                
    }
    private Category mapData(ResultSet rs)throws SQLException{
              Category category=new Category();
              category.setCatid(rs.getInt("catid"));
              category.setName(rs.getString("name"));
              category.setStatus(rs.getString("status"));
              return category;
    }
    
    @Override
    public int insert(Category c) throws SQLException {
        return jdbcTemplate.update(SQLConstant.CATEGORY_INSERT,new Object[]{c.getCatid(),c.getName(),c.getStatus()});
    }

    @Override
    public int update(Category c) throws SQLException {
        return jdbcTemplate.update(SQLConstant.CATEGORY_UPDATE,new Object[]{c.getName(),c.getStatus(),c.getCatid()});
    }

    @Override
    public int delete(int catid) throws SQLException {
        return jdbcTemplate.update(SQLConstant.CATEGORY_DELETE,new Object[]{catid});
    }

    @Override
    public Category getById(int catid) throws SQLException {
        return (Category) jdbcTemplate.queryForObject(SQLConstant.CATEGORY_GETById,new Object[]{catid},new RowMapper<Category>() {

            @Override
            public Category mapRow(ResultSet rs, int i) throws SQLException {
                return mapData(rs);
            }
        });
    }
    
}
