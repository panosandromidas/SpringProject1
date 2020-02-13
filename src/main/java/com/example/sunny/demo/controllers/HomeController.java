/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sunny.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author panos
 */
@Controller
public class HomeController {
    
  //@Getmapping(value = "/go")
   @RequestMapping(value = "/go", method = RequestMethod.GET)
    public String go(ModelMap mm){
     //modelmap gia na steilw plhroforia se jsp, edw fortwnw to montelo thw selidas
     mm.addAttribute("name","panagiotis"); // ayto ua mpei sto request scope
        return "home";}
    

//@GetMapping(value = "/search/{id}")
////    @RequestMapping(value = "/search/{id}", method = RequestMethod.GET)
//    public String search(ModelMap mm, @PathVariable String id){
//     //modelmap gia na steilw plhroforia se jsp, edw fortwnw to montelo thw selidas
//     mm.addAttribute("name", id); // ayto ua mpei sto request scope
//        return "home";}
//    
//}

//@GetMapping(value = "/")
    @RequestMapping(value = "/")
    public String showstartpage(){
            return "startpage";
    }
    
    @PostMapping(value = "/submitform")                 //PostMapping για να πάρει από τη φόρμα (έχω βάλει method post Στη φόρμα)
    public String FormController(ModelMap mm,
            @RequestParam(name = "text") String text,
            @RequestParam(name = "checkbox" , required=false) String checkbox,
            @RequestParam(name = "radio" , required=false) String radio) {
        mm.addAttribute("text", text);
        mm.addAttribute("checkbox", checkbox);
        mm.addAttribute("radio", radio);
        return "home";
    }
    
    @RequestMapping(value = "/user")
    public String searchUser(ModelMap model, @RequestParam(name = "role") String role) {
        model.addAttribute("userRole", role);
        System.out.println(role);
        return "home";
    }
    
}
  
   
    

