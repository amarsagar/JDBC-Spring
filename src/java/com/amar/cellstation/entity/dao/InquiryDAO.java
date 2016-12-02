/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.entity.dao;

import com.amar.cellstation.entity.Inquiry;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author amar
 */
public interface InquiryDAO {
   
    List<Inquiry> getAll() throws SQLException;
    int insert(Inquiry inq)throws SQLException;
    int update(Inquiry inq) throws SQLException;
    int delete (int inqid)throws SQLException;
    Inquiry getById(int inqid)throws SQLException;
}
