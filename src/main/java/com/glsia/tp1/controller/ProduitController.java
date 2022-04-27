package com.glsia.tp1.controller;

import com.glsia.tp1.models.Produit;
import com.glsia.tp1.service.CategoryService;
import com.glsia.tp1.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping("/produit")
public class ProduitController {

    //Injection de dépendance de service dans controller
    @Autowired
    private ProduitService produitService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/show")
    public String afficherProduit(Model model)
    {
        model.addAttribute("listProduit", produitService.showAllProduit());
        return "produit/showProduct";
    }

    @GetMapping("/create")
    public String AfficherFormulaire(Model model)
    {
        model.addAttribute("listCategory", categoryService.showAllCategory());
        return "produit/formProduit";
    }

    @PostMapping("/save")
    public String save(Produit produit)
    {
        produit.setQteStok(0);
        produit.setDateCreation(LocalDate.now());
        produitService.saveProduit(produit);
        return "redirect:/produit/show";
    }

    @GetMapping("/edit/{id}")
    public String formEditProduit(@PathVariable("id") int id, Model model)
    {
        model.addAttribute("unProduit", produitService.selectedProduit(id));
        model.addAttribute("listCategory", categoryService.showAllCategory());
        return "produit/formEditProduit";
    }

    @PostMapping("/edit")
    public String editProduit(@ModelAttribute("produit") Produit produit ){
        produitService.saveProduit(produit);
        return "redirect:/produit/show";
    }

    @GetMapping("delete/{id}")
    public String deleteProduit(@PathVariable("id") int id)
    {
        produitService.deleteProduit(id);
        return "redirect:/produit/show";
    }

    @GetMapping("/approvisionnement/form/{id}")
    public String approvisionnementProduit(@PathVariable("id") int id, Model model)
    {
        model.addAttribute("oneProduit", produitService.selectedProduit(id));
        return "approvisionnement/createForm";
    }

    @GetMapping("/graphiques")
    public String afficherGraphes(){
        return "template/pages/charts/chartjs";
    }


}
