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
public class Category {
    private int catid;
    private String name;
    private String status;

    public Category() {
    }

    public Category(int catid, String name, String status) {
        this.catid = catid;
        this.name = name;
        this.status = status;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Category{" + "catid=" + catid + ", name=" + name + ", status=" + status + '}';
    }
    
}
