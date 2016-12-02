/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.entity.dao;

import com.amar.cellstation.entity.UserType;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author amar
 */
public interface UserTypeDAO {
    
    List<UserType> getALL() throws SQLException;
    int insert(UserType u)throws SQLException;
    int update(UserType u)throws SQLException;
    int delete(int role_id)throws SQLException;
    UserType getById (int role_id)throws SQLException;
}
