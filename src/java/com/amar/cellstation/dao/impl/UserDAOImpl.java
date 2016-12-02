/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.dao.impl;

import com.amar.cellstation.constant.SQLConstant;
import com.amar.cellstation.entity.User;
import com.amar.cellstation.entity.dao.UserDAO;
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
@Repository (value="UserDAO")

public class UserDAOImpl implements UserDAO {

     @Autowired
     private JdbcTemplate jdbcTemplate;
    
    
    @Override
    public List<User> getALL() throws SQLException {
        return jdbcTemplate.query(SQLConstant.USER_GETALL,new RowMapper<User>() {

            @Override
            public User mapRow(ResultSet rs, int i) throws SQLException {
              return mapData(rs);
            }
        });
    }
    
    private User mapData(ResultSet rs)throws SQLException{
         User user=new User();
         user.setUid(rs.getInt("uid"));
         user.setFirstname(rs.getString("firstname"));
         user.setLastname(rs.getString("lastname"));
         user.setUsername(rs.getString("username"));
         user.setPassword(rs.getString("password"));
         user.setEmail(rs.getString("email"));
         user.setPhone(rs.getString("phone"));
         user.setAddress(rs.getString("address"));
         user.setRole_id(rs.getInt("role_id"));
         
         return user;
    }

    @Override
    public int insert(User u) throws SQLException {
     return jdbcTemplate.update(SQLConstant.USER_INSERT,new Object[]{u.getUid(),u.getFirstname(),u.getLastname(),u.getUsername(),u.getPassword(),u.getEmail(),u.getPhone(),u.getAddress(),u.getRole_id()});
    }

    @Override
    public int update(User u) throws SQLException {
       return jdbcTemplate.update(SQLConstant.USER_UPDATE,new Object[]{u.getFirstname(),u.getLastname(),u.getUsername(),u.getPassword(),u.getEmail(),u.getPhone(),u.getAddress(),u.getRole_id(),u.getUid()});
    }

    @Override
    public int delete(int uid) throws SQLException {
        return jdbcTemplate.update(SQLConstant.USER_DELETE,new Object[]{uid});
    }

    @Override
    public User getById(int uid) throws SQLException {
       return (User)jdbcTemplate.queryForObject(SQLConstant.USER_GETById,new Object[]{uid},new RowMapper<User>() {

           @Override
           public User mapRow(ResultSet rs, int i) throws SQLException {
               return mapData(rs);
           }
       });
    }
    
}
