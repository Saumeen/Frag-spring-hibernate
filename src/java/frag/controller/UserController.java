/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frag.controller;

import frag.dao.UserDao;
import frag.model.Questions_CLASS;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sonu
 */
@Controller
@SessionAttributes("Userid")
public class UserController {
     @Autowired
     private UserDao userDao;
     
     
     @RequestMapping("/home")
     public ModelAndView home(){
        
         ModelAndView model =new ModelAndView("Home");
     return model;
     }
     @RequestMapping("/showallquestion")
     public ModelAndView getquestion(){
         
         List<Questions_CLASS> qs = userDao.getAllQuestion();
         
         System.out.print("print---"+qs);
         
                 ModelAndView model =new ModelAndView("Home");

         model.addObject("question",qs);
         return model;
     }
     
     
    @RequestMapping("/questionpage")
    public ModelAndView Questionfatch(@ModelAttribute("Userid")int Userid){
        System.out.println("print--------------"+Userid);
        List<Questions_CLASS> question = userDao.getquestion(Userid);
        System.out.println("printttt===="+question);        
        ModelAndView model = new ModelAndView("Result2");
        model.addObject("question",question);
        return model;
    }
    
    @RequestMapping(value="/askquestion",method = RequestMethod.GET)
    public ModelAndView AskQuestion(@ModelAttribute("askque")Questions_CLASS qs){
    
        return new ModelAndView("askquestion","command",new Questions_CLASS());
    }
    
    @RequestMapping(value="/submitquestion",method = RequestMethod.GET)
    public ModelAndView submitQuestion(@ModelAttribute("askque")Questions_CLASS qs,@ModelAttribute("Userid")int um){
 
        userDao.insertQuestion(qs,um);
        return new ModelAndView("Home");        
        
    }
}

