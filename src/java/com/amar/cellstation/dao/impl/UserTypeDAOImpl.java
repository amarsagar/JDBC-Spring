/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.dao.impl;

import com.amar.cellstation.constant.SQLConstant;
import com.amar.cellstation.entity.UserType;
import com.amar.cellstation.entity.dao.UserTypeDAO;
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

@Repository(value="UserTypeDAO")

public class UserTypeDAOImpl implements UserTypeDAO{

    
     @Autowired 
     private JdbcTemplate jdbcTemplate;
     
    @Override
    public List<UserType> getALL() throws SQLException {
       return jdbcTemplate.query(SQLConstant.ROLE_GETALL, new RowMapper<UserType>() {

            @Override
            public UserType mapRow(ResultSet rs, int i) throws SQLException {
                return mapData(rs);
            }
        });
    }
     
    private UserType mapData(ResultSet rs)throws SQLException{
        UserType userType= new UserType();
        userType.setRole_id(rs.getInt("role_id"));
        userType.setRole(rs.getString("role"));
        return userType;
    }
    @Override
    public int insert(UserType u) throws SQLException {
       return  jdbcTemplate.update(SQLConstant.ROLE_INSERT,new Object[]{u.getRole_id(),u.getRole()});
    }

    @Override
    public int update(UserType u) throws SQLException {
       return  jdbcTemplate.update(SQLConstant.ROLE_UPDATE,new Object[]{u.getRole_id(),u.getRole()});
    }

    @Override
    public int delete(int role_id) throws SQLException {
        return jdbcTemplate.update(SQLConstant.ROLE_DELETE,new Object[]{role_id});
    }

    @Override
    public UserType getById(int role_id) throws SQLException {
        return (UserType)jdbcTemplate.queryForObject(SQLConstant.ROLE_GETById,new Object[]{role_id},new RowMapper<UserType>() {

            @Override
            public UserType mapRow(ResultSet rs, int i) throws SQLException {
               return mapData(rs);
            }
        });
    }
    
}
