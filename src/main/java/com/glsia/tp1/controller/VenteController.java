package com.glsia.tp1.controller;

import com.glsia.tp1.models.Produit;
import com.glsia.tp1.models.Vente;
import com.glsia.tp1.service.CategoryService;
import com.glsia.tp1.service.ClientService;
import com.glsia.tp1.service.ProduitService;
import com.glsia.tp1.service.VenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping("/vente")
public class VenteController {


    //Injection de dépendance de service dans controller
    @Autowired
    private VenteService venteService;
    @Autowired
    private ProduitService produitService;
    @Autowired
    private ClientService clientService;


    @GetMapping("/show")
    public String afficherVente(Model model)
    {
        model.addAttribute("listVente", venteService.showAllVente());
        return "vente/showVente";
    }

    @GetMapping("/create")
    public String AfficherFormulaire(Model model)
    {
        // Le produit de vente
        model.addAttribute("listVente", produitService.showAllProduit());

        return "produit/formVente";
    }

    @PostMapping("/save")
    public String save(Vente vente)
    {
        vente.setDateVente(LocalDate.now());
        venteService.saveVente(vente);
        return "redirect:/vente/show";
    }

    @GetMapping("/edit/{id}")
    public String formEditVente(@PathVariable("id") int id, Model model)
    {
        model.addAttribute("uneVente", venteService.selectedVente(id));
        model.addAttribute("unClient", clientService.selectedClient(id));
        model.addAttribute("listProduit", produitService.showAllProduit());

        return "vente/formEditVente";
    }

    @PostMapping("/edit")
    public String editVente(@ModelAttribute("produit") Vente vente ){
        venteService.saveVente(vente);
        return "redirect:/vente/show";
    }

    @GetMapping("delete/{id}")
    public String deleteVente(@PathVariable("id") int id)
    {
        venteService.deleteVente(id);
        // Quand on supprime une ventele client associé aussi est supprimé ?? A REVOIR
        //clientService.deleteClient(id);
        return "redirect:/vente/show";
    }


}
