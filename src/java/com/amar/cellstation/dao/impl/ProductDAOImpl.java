/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.dao.impl;

import com.amar.cellstation.constant.SQLConstant;
import com.amar.cellstation.entity.Product;
import com.amar.cellstation.entity.dao.ProductDAO;
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
@Repository(value="ProductDAO")

public class ProductDAOImpl implements ProductDAO {
    
     @Autowired
     private JdbcTemplate jdbcTemplate;
     
    @Override
    public List<Product> getALL() throws SQLException {
       return jdbcTemplate.query(SQLConstant.PRODUCT_GETALL, new RowMapper<Product>() {

           @Override
           public Product mapRow(ResultSet rs, int i) throws SQLException {
              return mapData(rs);
           }
       });
    }

    private Product mapData (ResultSet rs)throws SQLException{
        Product product=new Product();
        product.setPid(rs.getInt("pid"));
        product.setName(rs.getString("name"));
        product.setImage(rs.getString("image"));
        product.setDescription(rs.getString("description"));
        product.setAdded_date(rs.getString("added_date"));
        product.setCatid(rs.getInt("catid"));
        product.setStatus(rs.getString("status"));
        return product;
    }
    @Override
    public int insert(Product p) throws SQLException {
        return jdbcTemplate.update(SQLConstant.PRODUCT_INSERT,new Object[]{p.getPid(),p.getName(),p.getImage(),p.getDescription(),p.getAdded_date(),p.getCatid(),p.getStatus()});
    }

    @Override
    public int update(Product p) throws SQLException {
        
        return jdbcTemplate.update(SQLConstant.PRODUCT_UPDATE,new Object[]{p.getName(),p.getImage(),p.getDescription(),p.getAdded_date(),p.getCatid(),p.getStatus(),p.getPid()});
    }

    @Override
    public int delete(int pid) throws SQLException {
        return jdbcTemplate.update(SQLConstant.PRODUCT_INSERT,new Object[]{pid});
    }

    @Override
    public Product getById(int pid) throws SQLException {
      return (Product)jdbcTemplate.queryForObject(SQLConstant.PRODUCT_GETById,new Object[]{pid},new RowMapper<Product>() {

          @Override
          public Product mapRow(ResultSet rs, int i) throws SQLException {
              return mapData(rs);
          }
      });
    }
    
}
