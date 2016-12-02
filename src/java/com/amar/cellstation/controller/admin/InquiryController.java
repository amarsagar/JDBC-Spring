/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.cellstation.controller.admin;

import com.amar.cellstation.entity.Inquiry;
import com.amar.cellstation.service.InquiryService;
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
@RequestMapping(value="/admin/inquiry")
public class InquiryController {
    
    @Autowired
    private InquiryService inquiryService;
    
    @RequestMapping(method=RequestMethod.GET)
    public String index(ModelMap map)throws SQLException{
     map.addAttribute("Inquiry", inquiryService.getAll());
     return "admin/inquiry/index";
    }
    
    @RequestMapping(value="/add",method=RequestMethod.GET)
     public String add(Model map)throws SQLException{
         map.addAttribute("Inquiry", new Inquiry());
         return "/admin/inquiry/add";
     }   
     
     @RequestMapping(value="/save",method=RequestMethod.POST)
     public String save(@ModelAttribute("Inquiry") Inquiry i)throws SQLException{
        try{
            if(i.getInqid()==0){
                inquiryService.insert(i);
               }
            else{
                inquiryService.update(i);
            }
        }catch(SQLException se){
            
        }
        return "redirect:/admin/inquiry";
     }
     
     
     @RequestMapping(value="/edit/{inqid}",method=RequestMethod.GET)
     public String edit(@PathVariable("inqid")int inqid, Model model)throws SQLException{
     model.addAttribute("Inquiry", inquiryService.getById(inqid));
     return "admin/inquiry/edit";
}
}
