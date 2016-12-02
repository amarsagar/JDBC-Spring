/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.dao.impl;

import com.amar.cellstation.constant.SQLConstant;
import com.amar.cellstation.entity.Order;
import com.amar.cellstation.entity.dao.OrderDAO;
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
@Repository (value="OrderDAO")

public class OrderDAOImpl implements OrderDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<Order> getALL() throws SQLException {
        return jdbcTemplate.query(SQLConstant.ORDER_GETALL,new RowMapper<Order>() {

            @Override
            public Order mapRow(ResultSet rs, int i) throws SQLException {
              return mapData(rs);  
            }
        });
    }

    public Order mapData(ResultSet rs)throws SQLException {
        Order order=new Order();
        order.setOid(rs.getInt("oid"));
        order.setUid(rs.getInt("uid"));
        order.setOrder_date(rs.getString("order_date"));
        order.setStatus(rs.getString("status"));
        return order;
        
    }
    
    @Override
    public int insert(Order o) throws SQLException {
        return jdbcTemplate.update(SQLConstant.ORDER_INSERT,new Object[]{o.getOid(),o.getUid(),o.getOrder_date(),o.getStatus()});
    }

    @Override
    public int update(Order o) throws SQLException {
       return jdbcTemplate.update(SQLConstant.ORDER_UPDATE,new Object[]{o.getUid(),o.getOrder_date(),o.getStatus(),o.getOid()});
    }

    @Override
    public int delete(int oid) throws SQLException {
       return jdbcTemplate.update(SQLConstant.ORDER_DELETE,new Object[]{oid});
    }

    @Override
    public Order getById(int oid) throws SQLException {
        return (Order)jdbcTemplate.queryForObject(SQLConstant.ORDER_GETById,new Object[]{oid},new RowMapper<Order>() {

            @Override
            public Order mapRow(ResultSet rs, int i) throws SQLException {
                return mapData(rs);
            }
        });
    }
    
    
}
