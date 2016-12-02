/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.dao.impl;

import com.amar.cellstation.constant.SQLConstant;
import com.amar.cellstation.entity.OrderDetail;
import com.amar.cellstation.entity.dao.OrderDetailDAO;
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

@Repository (value="OrderDetailDAO")

public class OrderDetailDAOImpl implements OrderDetailDAO{
    
    @Autowired
    public JdbcTemplate jdbcTemplate;
    
    
    @Override
    public List<OrderDetail> getAll() throws SQLException {
        return jdbcTemplate.query(SQLConstant.ORDERDETAIL_GETALL,new RowMapper<OrderDetail>() {

            @Override
            public OrderDetail mapRow(ResultSet rs, int i) throws SQLException {
               return mapData(rs);
            }
        });
    }

    public OrderDetail mapData(ResultSet rs)throws SQLException{
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setOdid(rs.getInt("odid"));
        orderDetail.setOid(rs.getInt("oid"));
        orderDetail.setPid(rs.getInt("pid"));
        orderDetail.setPrice(rs.getInt("price"));
        orderDetail.setQuantity(rs.getInt("quantity"));
        return orderDetail;
    }
    
    @Override
    public int insert(OrderDetail od) throws SQLException {
        return jdbcTemplate.update(SQLConstant.ORDERDETAIL_INSERT,new Object[]{od.getOdid(),od.getOid(),od.getPid(),od.getPrice(),od.getQuantity()});
    }

    @Override
    public int update(OrderDetail od) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int odid) throws SQLException {
        return jdbcTemplate.update(SQLConstant.ORDERDETAIL_DELETE,new Object[]{odid});
    }

    @Override
    public OrderDetail getById(int odid) throws SQLException {
        return (OrderDetail)jdbcTemplate.queryForObject(SQLConstant.ORDERDETAIL_GETById,new Object[]{odid},new RowMapper<OrderDetail>() {

            @Override
            public OrderDetail mapRow(ResultSet rs, int i) throws SQLException {
                return mapData(rs);
            }
        });
    }
    
    
}
