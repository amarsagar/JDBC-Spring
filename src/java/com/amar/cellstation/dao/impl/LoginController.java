/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.dao.impl;

import com.amar.cellstation.entity.User;
import com.amar.cellstation.entity.dao.UserDAO;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author amar
 */
@Controller
@RequestMapping(value="/admin/login")

public class LoginController {
    @Autowired
     UserDAO userDAO;
    
     @RequestMapping(value="/login", method=RequestMethod.GET)
     public String login(Model model)throws SQLException{
        
         return "/admin/login/login";
     }
     
     @RequestMapping(value="/save", method=RequestMethod.POST)
     public String save(HttpServletRequest request)throws SQLException{
          String username=request.getParameter("username");
          String password=request.getParameter("password");
          System.out.println(username + password);
          User user = new User();
          user.setUsername(username);
          user.setPassword(password);
          
          userDAO.verify(username, password);
          
          System.out.println( userDAO.verify(username, password));
          
          return null;
     }
     
     
}
