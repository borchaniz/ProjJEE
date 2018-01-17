package com.insat.gestionformation.controllers;

import com.insat.gestionformation.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        System.out.println("Looking in the index controller.........");
        return "index";
    }
}
