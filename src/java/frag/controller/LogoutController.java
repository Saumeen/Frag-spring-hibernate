/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frag.controller;

import frag.model.UserMain;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sonu
 */
@Controller
@SessionAttributes("Userid")
public class LogoutController {
        @RequestMapping("/logout.html")
        public ModelAndView logout(SessionStatus status,@ModelAttribute("Userid")int id){
        status.setComplete();
        ModelAndView model=new ModelAndView("Home");
        model.addObject("id",id);
        System.out.println("print-----"+id);
        return model;
}
    
}
