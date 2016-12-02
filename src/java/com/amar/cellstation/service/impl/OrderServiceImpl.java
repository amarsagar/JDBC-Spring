/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.service.impl;

import com.amar.cellstation.entity.Order;
import com.amar.cellstation.entity.dao.OrderDAO;
import com.amar.cellstation.service.OrderService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amar
 */
@Service(value="OrderService")

public class OrderServiceImpl implements OrderService {
    
    @Autowired
    private OrderDAO orderDAO;

    @Override
    public List<Order> getALL() throws SQLException {
        return orderDAO.getALL();
    }

    @Override
    public int insert(Order o) throws SQLException {
     return orderDAO.insert(o);
    }

    @Override
    public int update(Order o) throws SQLException {
       return orderDAO.update(o);
    }

    @Override
    public int delete(int oid) throws SQLException {
      return orderDAO.delete(oid);
    }

    @Override
    public Order getById(int oid) throws SQLException {
        return orderDAO.getById(oid);
    }
    
}
