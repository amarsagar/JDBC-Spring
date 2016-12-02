/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.entity.dao;

import com.amar.cellstation.entity.User;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author amar
 */
public interface UserDAO {
    
    List<User> getALL() throws SQLException;
    int insert (User u) throws SQLException;
    int update (User u) throws SQLException;
    int delete (int uid) throws SQLException;
    User getById (int uid) throws SQLException;
       
}
