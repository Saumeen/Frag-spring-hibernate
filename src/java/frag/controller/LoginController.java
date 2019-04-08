/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frag.controller;

import frag.dao.UserDao;
import frag.model.LoginDetail;
import frag.model.UserMain;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
public class LoginController {
        @Autowired
        private UserDao userDao;
    
        
    
        @RequestMapping(value="/login",method = RequestMethod.GET)
        public ModelAndView login(){
            return new ModelAndView("Login","command",new UserMain());
        }

        @RequestMapping(value="/Result",method= RequestMethod.POST)
        public String addUser(@ModelAttribute("SpringWeb")LoginDetail logindetail,ModelMap model){
            model.addAttribute("name",logindetail.getName());
            model.addAttribute("password",logindetail.getPassword());
            
            return "Result";
        }
     
        @RequestMapping(value="/Signup",method = RequestMethod.GET)
        public ModelAndView signin(@ModelAttribute("userentry")UserMain usermain,ModelMap model) {
            return new ModelAndView("Signup","command",new UserMain());
        }
        
        @RequestMapping(value="/SignupResult",method = RequestMethod.GET)
        public String AddData(@ModelAttribute("userentry")UserMain usermain,ModelMap model) {
          userDao.insertUser(usermain);
          model.addAttribute("name",usermain.getUsername());
          return "Result";
        }
      
        @RequestMapping(value="/LoginSuccess",method= RequestMethod.GET)
        public ModelAndView loginSuccess(@ModelAttribute("loginentry")UserMain usermain,ModelMap model){
            String user = usermain.getUsername();
            String password = usermain.getPassword();
                  List<UserMain> flag= userDao.CheckValidate(user, password);
                  System.out.println("print----------" +flag);
                  
                if(!flag.isEmpty()){
                    System.out.println("if");
                     model.addAttribute("Userid",flag.get(0).getUid());
                     model.addAttribute("id",flag);
                     
                    return new ModelAndView("Result");
                }
                else{
                    System.out.println("else");
                    return new ModelAndView("Login","command",new UserMain());
                }
                
        }
}
        
        
        


    

