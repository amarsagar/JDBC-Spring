/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.service.impl;

import com.amar.cellstation.entity.User;
import com.amar.cellstation.entity.dao.UserDAO;
import com.amar.cellstation.service.UserService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amar
 */
@Service(value="UserService")
public class UserServiceImpl implements UserService{
      
    @Autowired
    private UserDAO userDAO;
    
    @Override
    public List<User> getALL() throws SQLException {
     return userDAO.getALL();
    }

    @Override
    public int insert(User u) throws SQLException {
     return userDAO.insert(u);
    }

    @Override
    public int update(User u) throws SQLException {
     return userDAO.update(u);
    }

    @Override
    public int delete(int uid) throws SQLException {
    return userDAO.delete(uid);
    }

    @Override
    public User getById(int uid) throws SQLException {
    return userDAO.getById(uid);
    }
    
}
