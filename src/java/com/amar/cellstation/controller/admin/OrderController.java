/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.controller.admin;

import com.amar.cellstation.entity.Order;
import com.amar.cellstation.service.OrderService;
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
@RequestMapping(value="/admin/order")
public class OrderController {
    
    @Autowired
    private OrderService orderService;
    
    @RequestMapping(method=RequestMethod.GET)
    public String index(Model map)throws SQLException{
        map.addAttribute("Order", orderService.getALL());
        return "admin/order/index";
    }
    
    @RequestMapping(value="/add",method=RequestMethod.GET)
    public String add(Model map)throws SQLException{
        map.addAttribute("Order", new Order());
        return "/admin/order/add";
    } 
    
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public String save(@ModelAttribute("Order") Order o)throws SQLException{
        try{
            if(o.getOid()==0){
                orderService.insert(o);
            }else{
                orderService.update(o);
            }
        }catch(SQLException se){
            
        }
        
        return "redirect:/admin/order";
    }
    
    @RequestMapping(value="/edit/{oid}", method=RequestMethod.GET)
    public String edit(@PathVariable("oid")int oid,Model model)throws SQLException{
        model.addAttribute("Order", orderService.getById(oid));
        return "/admin/order/edit";
    }
}
