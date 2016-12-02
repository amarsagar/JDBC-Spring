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
public class OrderDetail {
    
    public int odid;
    public int pid;
    public int price;
    public int oid;
    public int quantity;

    public OrderDetail(int odid, int pid, int price, int oid, int quantity) {
        this.odid = odid;
        this.pid = pid;
        this.price = price;
        this.oid = oid;
        this.quantity = quantity;
    }
    
    public OrderDetail(){
        
    }

    public int getOdid() {
        return odid;
    }

    public void setOdid(int odid) {
        this.odid = odid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "odid=" + odid + ", pid=" + pid + ", price=" + price + ", oid=" + oid + ", quantity=" + quantity + '}';
    }
    
    
    
}
