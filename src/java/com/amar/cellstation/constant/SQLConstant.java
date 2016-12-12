/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.constant;

/**
 *
 * @author amar
 */
public class SQLConstant {
    
     //tbl_category
    
    public final static String CATEGORY_GETALL= " SELECT * from " + TableConstant.CATEGORY_TABLE;
    public final static String CATEGORY_GETById= " SELECT * from " + TableConstant.CATEGORY_TABLE  + " WHERE catid=? ";
    public final static String CATEGORY_INSERT= " INSERT  into " + TableConstant.CATEGORY_TABLE +
            " (catid,name,status) VALUES(?,?,?) " ;
    public final static String CATEGORY_UPDATE= " UPDATE " + TableConstant.CATEGORY_TABLE +
            " SET name=?,status=? WHERE catid=? " ;
    public final static String CATEGORY_DELETE= " DELETE from " + TableConstant.CATEGORY_TABLE + " WHERE catid = ? ";



   //tbl_product
    public final static String PRODUCT_GETALL= " SELECT * from " + TableConstant.PRODUCT_TABLE;
    public final static String PRODUCT_GETById= " SELECT * from " + TableConstant.PRODUCT_TABLE + " WHERE pid=? ";
    public final static String PRODUCT_INSERT= " INSERT  into " + TableConstant.PRODUCT_TABLE +
            " (pid,name,image,description,added_date,catid,status) VALUES(?,?,?,?,?,?,?) " ;
    public final static String PRODUCT_UPDATE= " UPDATE " + TableConstant.PRODUCT_TABLE +
            " SET name=?, image=?, description=?, added_date=?, catid=?, status=? WHERE pid = ? " ;
    public final static String PRODUCT_DELETE= " DELETE from " + TableConstant.PRODUCT_TABLE + " WHERE pid=? ";
 
    
    //tbl_order
    
    public final static String ORDER_GETALL= " SELECT * from " + TableConstant.ORDER_TABLE;
    public final static String ORDER_GETById= " SELECT * from " + TableConstant.ORDER_TABLE + " WHERE oid=? ";
    public final static String ORDER_INSERT= " INSERT  into " + TableConstant.ORDER_TABLE +
            " (oid,uid,order_date,status) VALUES(?,?,?,?) " ;
    public final static String ORDER_UPDATE= " UPDATE " + TableConstant.ORDER_TABLE +
            " SET uid=?,order_date=?,status=? WHERE OID=? " ;
    public final static String ORDER_DELETE= " DELETE from " + TableConstant.ORDER_TABLE + " WHERE oid=? ";
   

    
    
    //tbl_inquiry
    
    public final static String INQUIRY_GETALL= " SELECT * from " + TableConstant.INQUIRY_TABLE;
    public final static String INQUIRY_GETById= " SELECT * from " + TableConstant.INQUIRY_TABLE + " WHERE inqid=? ";
    public final static String INQUIRY_INSERT= " INSERT  into " + TableConstant.INQUIRY_TABLE +
            " (inqid,pid,uid,inquiry_date,inquiry,status) VALUES(?,?,?,?,?,?) " ;
    public final static String INQUIRY_UPDATE= " UPDATE " + TableConstant.INQUIRY_TABLE +
            " SET pid=?,uid=?,inquiry_date=?,inquiry=?,status=? WHERE inqid=? " ;
    public final static String INQUIRY_DELETE= " DELETE from " + TableConstant.INQUIRY_TABLE + " WHERE inqid=? ";
   
    
    //tbl_user
    
    public final static String USER_GETALL= " SELECT * from " + TableConstant.USER_TABLE;
    public final static String USER_GETById= " SELECT * from " + TableConstant.USER_TABLE + " WHERE uid=? ";
    public final static String USER_INSERT= " INSERT  into " + TableConstant.USER_TABLE +
            " (uid,firstname,lastname,username,password,email,phone,address,role_id) VALUES(?,?,?,?,?,?,?,?,?) " ;
    public final static String USER_UPDATE= " UPDATE " + TableConstant.USER_TABLE +
            " SET firstname=?,lastname=?,username=?,password=?,email=?,phone=?,address=?,role_id=? WHERE UID=? " ;
    public final static String USER_DELETE= " DELETE from " + TableConstant.USER_TABLE + " WHERE uid=? ";
    public final static String USER_LOGIN= " select * from " +TableConstant.USER_TABLE+ " where username=? and password=?";
   


    
    //tbl_role
    
    public final static String ROLE_GETALL= " SELECT * from " + TableConstant.ROLE_TABLE;
    public final static String ROLE_GETById= " SELECT * from " + TableConstant.ROLE_TABLE + " WHERE role_id=? ";
    public final static String ROLE_INSERT= " INSERT  into " + TableConstant.ROLE_TABLE +
            " (role_id,role) VALUES(?,?) " ;
    public final static String ROLE_UPDATE= " UPDATE " + TableConstant.ROLE_TABLE +
            " SET role=? WHERE role_id=? " ;
    public final static String ROLE_DELETE= " DELETE from " + TableConstant.ROLE_TABLE + " WHERE role_id=? ";
    
    
    //tbl_orderdetail
    
    public final static String ORDERDETAIL_GETALL= " SELECT * from " + TableConstant.ORDERDETAIL_TABLE;
    public final static String ORDERDETAIL_GETById= " SELECT * from " + TableConstant.ORDERDETAIL_TABLE + " WHERE odid=? ";
    public final static String ORDERDETAIL_INSERT= " INSERT  into " + TableConstant.ORDERDETAIL_TABLE +
            " (odid,pid,price,oid,quantity) VALUES(?,?,?,?,?) " ;
   // public final static String ORDERDETAIL_UPDATE= " UPDATE " + TableConstant.ORDERDETAIL_TABLE +
            //" SET odid=?,pid=?,price=?,oid=?,quantity=? WHERE ODID=? " ;
    public final static String ORDERDETAIL_DELETE= " DELETE from " + TableConstant.ORDERDETAIL_TABLE + " WHERE odid=? ";

    
    
}
