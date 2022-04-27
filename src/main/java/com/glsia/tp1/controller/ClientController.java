package com.glsia.tp1.controller;

import com.glsia.tp1.models.Client;
import com.glsia.tp1.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/show")
    public String afficherClient(Model model)
    {
        model.addAttribute("listClient", clientService.showAllClient());
        return "client/showClient";
    }

    @GetMapping("/create")
    public String AfficherFormulaire(Model model)
    {
        return "produit/formClient";
    }

    @PostMapping("/save")
    public String save(Client client)
    {

        client.setDateEnregistre(LocalDate.now());
        clientService.saveClient(client);
        return "redirect:/client/show";
    }

    // editer un client

    @GetMapping("/edit/{id}")
    public String formEditClient(@PathVariable("id") int id, Model model)
    {
        model.addAttribute("unClient", clientService.selectedClient(id));
        return "client/formEditClient";
    }

    @GetMapping("delete/{id}")
    public String deleteClient(@PathVariable("id") int id)
    {
        clientService.deleteClient(id);
        return "redirect:/client/show";
    }



}
