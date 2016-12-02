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
public class Order {
    
    public int oid;
    public int uid;
    public String order_date;
    public String status;

    public Order(int oid, int uid, String order_date, String status) {
        this.oid = oid;
        this.uid = uid;
        this.order_date = order_date;
        this.status = status;
    }

     public Order(){
         
     }
    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" + "oid=" + oid + ", uid=" + uid + ", order_date=" + order_date + ", status=" + status + '}';
    }
    
    
    
}
