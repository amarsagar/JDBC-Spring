/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.controller.admin;

import com.amar.cellstation.entity.OrderDetail;
import com.amar.cellstation.service.OrderDetailService;
import com.amar.cellstation.service.OrderService;
import com.amar.cellstation.service.ProductService;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author amar
 */
@Controller
@RequestMapping(value="/admin/orderdetail")

public class OrderDetailController {
    @Autowired
    private OrderDetailService orderDetailService;
    @Autowired
    private ProductService productService;
    @Autowired 
    private OrderService orderService;
    
    @RequestMapping (method=RequestMethod.GET)
    public String index(ModelMap map)throws SQLException{
        map.addAttribute("OrderDetail", orderDetailService.getAll());
        return "admin/orderdetail/index";
    }
    
    @RequestMapping (value="add", method=RequestMethod.GET)
    public String add(Model map, Model model)throws SQLException{
        map.addAttribute("OrderDetail", new OrderDetail());
        model.addAttribute("pid", productService.getALL());  //for foreignkey
        model.addAttribute("oid",orderDetailService.getAll());
        return "/admin/orderdetail/add";
        
    }
    
    @RequestMapping(value="save", method=RequestMethod.POST)
    public String save(@ModelAttribute("OrderDetail")OrderDetail od)throws SQLException{
        try{
            if(od.getOdid()==0){
                orderDetailService.insert(od);
            }
            else{
                orderDetailService.update(od);
            }
        }catch(SQLException se){
            
        }
        return "redirect:/admin/orderdetail";
    }
    
    @RequestMapping(value="/edit/{odid}", method=RequestMethod.GET)
    public String edit(@PathVariable("odid")int odid, Model model)throws SQLException{
        model.addAttribute("OrderDetail",orderDetailService.getById(odid));
        model.addAttribute("pid", productService.getALL());
        model.addAttribute("oid",orderDetailService.getAll());
        return "/admin/orderdetail/edit";
    }
    
    @RequestMapping(value="/delete/{odid}",method=RequestMethod.GET)
    public String delete(@PathVariable("odid")int odid)throws SQLException{
        orderDetailService.delete(odid);
        return "redirect:/admin/orderdetail";
    }
}

