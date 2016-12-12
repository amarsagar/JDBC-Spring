/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.controller.admin;

import com.amar.cellstation.entity.UserType;
import com.amar.cellstation.service.UserTypeService;
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
@RequestMapping(value="/admin/usertype")
public class UserTypeController {
    
    
    @Autowired
    private UserTypeService userTypeService;
    
    @RequestMapping(method=RequestMethod.GET)
    public  String index(ModelMap map) throws SQLException{
           map.addAttribute("UserType", userTypeService.getALL());
           return "admin/usertype/index";
}
   
    @RequestMapping(value="/add", method=RequestMethod.GET)
    public String add(Model map)throws SQLException{
        map.addAttribute("UserType", new UserType());
        return "/admin/usertype/add";
    }
    
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public String save(@ModelAttribute("UserType")UserType u)throws SQLException{
        try{
            if(u.getRole_id()==0){
                userTypeService.insert(u);
            }else{
                userTypeService.update(u);
            }
        }catch(SQLException se){
    }
        return "redirect:/admin/usertype";
    }
    
    @RequestMapping(value="edit/{role_id}", method=RequestMethod.GET)
      public String edit(@PathVariable("role_id")int tole_id,Model model)throws SQLException{
          model.addAttribute("UserType", userTypeService.getById(tole_id));
          return "/admin/usertype/edit";
      }
      
      @RequestMapping (value="delete/{role_id}", method=RequestMethod.GET)
      public String delete(@PathVariable("role_id")int role_id)throws SQLException{
          userTypeService.delete(role_id);
          return "redirect:/admin/usertype";
      }
}
