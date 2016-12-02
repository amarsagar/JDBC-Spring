/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.controller.admin;

import com.amar.cellstation.service.UserTypeService;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
}
