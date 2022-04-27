package com.glsia.tp1.controller;

import com.glsia.tp1.service.CategoryService;
import com.glsia.tp1.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //Injection de dépendance de service dans controller
    @Autowired
    private ProduitService produitService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/home")
    public String afficherAccueil()
    {
        return "template/index";
    }
}
