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
public class Product {
    
    private int pid;
    private String name;
    private String Image;
    private String description;
    private String added_date;
    private String status;
    private int catid;

    
    
    
    public Product(int pid, String name, String Image, String description, String added_date, String status, int catid) {
        this.pid = pid;
        this.name = name;
        this.Image = Image;
        this.description = description;
        this.added_date = added_date;
        this.status = status;
        this.catid = catid;
    }
    
    public Product(){
        
    }
    

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdded_date() {
        return added_date;
    }

    public void setAdded_date(String added_date) {
        this.added_date = added_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    @Override
    public String toString() {
        return "Product{" + "pid=" + pid + ", name=" + name + ", Image=" + Image + ", description=" + description + ", added_date=" + added_date + ", status=" + status + ", catid=" + catid + '}';
    }
    
    
    
}
