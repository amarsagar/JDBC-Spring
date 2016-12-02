/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.service;

import com.amar.cellstation.entity.OrderDetail;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author amar
 */
public interface OrderDetailService {
    
    List<OrderDetail> getAll() throws SQLException;
    int insert (OrderDetail od)throws SQLException;
    int update (OrderDetail od) throws SQLException;
    int delete (int odid)throws SQLException;
    OrderDetail getById(int odid)throws SQLException;
}
