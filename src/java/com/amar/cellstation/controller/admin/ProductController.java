/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.controller.admin;

import com.amar.cellstation.entity.Product;
import com.amar.cellstation.service.ProductService;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *
 * @author amar
 */
@Controller
@RequestMapping (value="/admin/product")

public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @RequestMapping(method=RequestMethod.GET)
    public String index(Model map)throws SQLException{
        map.addAttribute("Product",productService.getALL());
        System.out.println(productService.getALL());
        return "admin/product/index";
    }
    
    @RequestMapping (value="/add", method=RequestMethod.GET)
       public String add(Model map) throws SQLException{
        map.addAttribute("Product" ,new Product());
        return "/admin/product/add";
       }
    
    
    @RequestMapping(value ="/save", method = RequestMethod.POST)
      public String save(@ModelAttribute("Product") Product p) throws SQLException
       {
        try{
        if(p.getPid()==0){
           // System.out.println("asdansjdsjd");
            productService.insert(p);
        }
        else{
//            System.out.println(p);
//            System.out.println("I am hre");
            productService.update(p);
        }
       }catch(SQLException se){
       }
      return "redirect:/admin/product";
      
        }
      
      @RequestMapping(value="/edit/{pid}",method=RequestMethod.GET)
      public String edit(@PathVariable("pid")int pid,Model model)throws SQLException{
//          System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//          System.out.println(productService.getById(pid));
          model.addAttribute("Product",productService.getById(pid));
          return "/admin/product/edit";
      }
}
