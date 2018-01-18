package com.insat.gestionformation.controllers;

import com.insat.gestionformation.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController{

    @RequestMapping(value={"/"}, method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView m= new ModelAndView();
        m.setViewName("index");
        System.out.println("Looking in the index controller.........");
        return m;
    }
}
