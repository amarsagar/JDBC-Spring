/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.dao.impl;

import com.amar.cellstation.constant.SQLConstant;
import com.amar.cellstation.entity.Inquiry;
import com.amar.cellstation.entity.dao.InquiryDAO;
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
@Repository (value="InquiryDAO")

public class InquiryDAOImpl implements InquiryDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<Inquiry> getAll() throws SQLException {
        return jdbcTemplate.query(SQLConstant.INQUIRY_GETALL,new RowMapper<Inquiry>() {

            @Override
            public Inquiry mapRow(ResultSet rs, int i) throws SQLException {
               return mapData(rs);
            }
        });
    }
    
    public Inquiry mapData(ResultSet rs) throws SQLException{
       Inquiry inquiry=new Inquiry();
       inquiry.setInqid(rs.getInt("inqid"));
       inquiry.setPid(rs.getInt("pid"));
       inquiry.setUid(rs.getInt("uid"));
       inquiry.setInquiry(rs.getString("inquiry"));
       inquiry.setInquiry_date(rs.getString("inquiry_date"));
       inquiry.setStatus(rs.getString("status"));
       return inquiry;
    }
    
    @Override
    public int insert(Inquiry inq) throws SQLException {
        return jdbcTemplate.update(SQLConstant.INQUIRY_INSERT,new Object[]{inq.getInqid(),inq.getPid(),inq.getUid(),inq.getInquiry_date(),inq.getInquiry(),inq.getStatus()});
    }

    @Override
    public int update(Inquiry inq) throws SQLException {
        return jdbcTemplate.update(SQLConstant.INQUIRY_UPDATE,new Object[]{inq.getPid(),inq.getUid(),inq.getInquiry_date(),inq.getInquiry(),inq.getStatus(),inq.getInqid()});
    }

    @Override
    public int delete(int inqid) throws SQLException {
        return jdbcTemplate.update(SQLConstant.INQUIRY_DELETE,new Object[]{inqid});
    }

    @Override
    public Inquiry getById(int inqid) throws SQLException {
        return (Inquiry)jdbcTemplate.queryForObject(SQLConstant.INQUIRY_GETById, new Object[]{inqid},new RowMapper<Inquiry>() {

            @Override
            public Inquiry mapRow(ResultSet rs, int i) throws SQLException {
               return mapData(rs);
            }
        });
    }
    
}
