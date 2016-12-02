/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.controller.admin;

import com.amar.cellstation.entity.Category;
import com.amar.cellstation.service.CategoryService;
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
@RequestMapping(value="/admin/categories")
public class CategoryController {
 
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping(method=RequestMethod.GET)
    public  String index(ModelMap map) throws SQLException{
           map.addAttribute("Category", categoryService.getALL());
           // System.out.println(categoryService.getALL());
           return "admin/categories/index";
    }
    
    @RequestMapping(value="/add",method=RequestMethod.GET)
    public String add(Model map)throws SQLException{
        map.addAttribute("Category", new Category());
        return "/admin/categories/add";
    }
    
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public String save(@ModelAttribute("Category") Category c)throws SQLException {
        try {
            if(c.getCatid()==0){
                 System.out.println("asdansjdsjd");
                categoryService.insert(c);
            }
            else{
                categoryService.update(c);                  
                }
        } catch (Exception e) {
        }
            return "redirect:/admin/categories";
        }
    
    @RequestMapping(value="/edit/{catid}", method=RequestMethod.GET)
     public String edit(@PathVariable("catid") int catid, Model model)throws SQLException{
         model.addAttribute("Category", categoryService.getById(catid));
         return "/admin/categories/edit";
         
     }
    
    
}
