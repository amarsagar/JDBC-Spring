/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.service.impl;

import com.amar.cellstation.entity.OrderDetail;
import com.amar.cellstation.entity.dao.OrderDetailDAO;
import com.amar.cellstation.service.OrderDetailService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amar
 */
@Service (value="OrderDetailService")

public class OrderDetailServiceImpl implements OrderDetailService {
    
    @Autowired
    private OrderDetailDAO orderDetailDAO;
            
    @Override
    public List<OrderDetail> getAll() throws SQLException {
       return orderDetailDAO.getAll();
    }

    @Override
    public int insert(OrderDetail od) throws SQLException {
        return orderDetailDAO.insert(od);
    }

    @Override
    public int update(OrderDetail od) throws SQLException {
        return orderDetailDAO.update(od);
    }

    @Override
    public int delete(int odid) throws SQLException {
       return orderDetailDAO.delete(odid);
    }

    @Override
    public OrderDetail getById(int odid) throws SQLException {
        return orderDetailDAO.getById(odid);
    }
    
}
