/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.entity;

/**
 *
 * @author amar
 */
public class Inquiry {
    
    public int inqid;
    public int uid;
    public int pid;
    public String inquiry;
    public String inquiry_date;
    public String status;

    public Inquiry(int inqid, int uid, int pid, String inquiry, String inquiry_date, String status) {
        this.inqid = inqid;
        this.uid = uid;
        this.pid = pid;
        this.inquiry = inquiry;
        this.inquiry_date = inquiry_date;
        this.status = status;
    }
    
    public Inquiry(){
        
    }

    public int getInqid() {
        return inqid;
    }

    public void setInqid(int inqid) {
        this.inqid = inqid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getInquiry() {
        return inquiry;
    }

    public void setInquiry(String inquiry) {
        this.inquiry = inquiry;
    }

    public String getInquiry_date() {
        return inquiry_date;
    }

    public void setInquiry_date(String inquiry_date) {
        this.inquiry_date = inquiry_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Inquiry{" + "inqid=" + inqid + ", uid=" + uid + ", pid=" + pid + ", inquiry=" + inquiry + ", inquiry_date=" + inquiry_date + ", status=" + status + '}';
    }
    
    
    
}
