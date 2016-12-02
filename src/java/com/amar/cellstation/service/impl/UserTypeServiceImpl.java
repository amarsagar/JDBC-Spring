/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.service.impl;

import com.amar.cellstation.entity.UserType;
import com.amar.cellstation.entity.dao.UserTypeDAO;
import com.amar.cellstation.service.UserTypeService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amar
 */
@Service(value="UserTypeService")

public class UserTypeServiceImpl implements UserTypeService{

    @Autowired
    private UserTypeDAO userTypeDAO;
    
    
    @Override
    public List<UserType> getALL() throws SQLException {
        return userTypeDAO.getALL();
    }

    @Override
    public int insert(UserType u) throws SQLException {
        return userTypeDAO.insert(u);
    }

    @Override
    public int update(UserType u) throws SQLException {
        return userTypeDAO.update(u);
    }

    @Override
    public int delete(int role_id) throws SQLException {
        return userTypeDAO.delete(role_id);
    }

    @Override
    public UserType getById(int role_id) throws SQLException {
       return userTypeDAO.getById(role_id);
    }
    
    
    
}
