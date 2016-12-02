/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.service.impl;

import com.amar.cellstation.entity.Inquiry;
import com.amar.cellstation.entity.dao.InquiryDAO;
import com.amar.cellstation.service.InquiryService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amar
 */
@Service(value="InquiryService")

public class InquiryServiceImpl implements InquiryService {

     @Autowired
     private InquiryDAO inquiryDAO;
   
     @Override    
    public List<Inquiry> getAll() throws SQLException {
       return inquiryDAO.getAll();
    }

    @Override
    public int insert(Inquiry inq) throws SQLException {
        return inquiryDAO.insert(inq);
    }

    @Override
    public int update(Inquiry inq) throws SQLException {
        return inquiryDAO.update(inq);
    }

    @Override
    public int delete(int inqid) throws SQLException {
       return inquiryDAO.delete(inqid);
    }

    @Override
    public Inquiry getById(int inqid) throws SQLException {
        return inquiryDAO.getById(inqid);
    }
    
}
