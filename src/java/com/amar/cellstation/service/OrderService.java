/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.service;

import com.amar.cellstation.entity.Order;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author amar
 */
public interface OrderService {
    
    
    List<Order> getALL() throws SQLException;
    int insert(Order o) throws SQLException;
    int update (Order o) throws SQLException;
    int delete (int oid)throws SQLException;
    Order getById(int oid)throws SQLException;
}
