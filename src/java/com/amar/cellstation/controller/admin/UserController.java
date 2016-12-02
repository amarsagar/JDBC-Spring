/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.controller.admin;

import com.amar.cellstation.entity.User;
import com.amar.cellstation.service.UserService;
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
@RequestMapping(value="/admin/user")
public class UserController {
   
    @Autowired
    private UserService userService;
    @Autowired
    private UserTypeService userTypeService;
    
    @RequestMapping(method=RequestMethod.GET)
    public String index(Model map)throws SQLException{
         map.addAttribute("User",userService.getALL());
         return "admin/user/index";
    }
    
     
    @RequestMapping(value="/add",method=RequestMethod.GET)
     public String add(ModelMap map,Model model)throws SQLException{
       // User user = new User();
        //map.addAttribute(user);
         
         model.addAttribute("role",userTypeService.getALL());
//         System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//         System.out.println(userTypeService.getALL());
         map.addAttribute("User", new User());
        return "/admin/user/add";
     }
      
      @RequestMapping(value ="/save", method = RequestMethod.POST)
      public String save(@ModelAttribute("User") User u) throws SQLException
      {
       try{
           if(u.getUid()==0){
              userService.insert(u);
              
           }else{
               userService.update(u);
           }
       }catch(SQLException se){
           
       }
      return "redirect:/admin/user";
      
      }
    
      
        @RequestMapping(value = "/edit/{uid}", method = RequestMethod.GET)
        public String edit(@PathVariable("uid") int uid, Model model) throws SQLException{
        model.addAttribute("User",userService.getById(uid));
        model.addAttribute("role", userTypeService.getALL());
          return "/admin/user/edit";
    }
}
