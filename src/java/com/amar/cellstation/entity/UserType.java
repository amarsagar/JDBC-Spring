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
public class UserType {
    private int role_id;
    private String role;
    
    public UserType(){
    
       }

    public UserType(int role_id, String role) {
        this.role_id = role_id;
        this.role = role;
    }

    
    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserType{" + "role_id=" + role_id + ", role=" + role + '}';
    }
    
    
}
