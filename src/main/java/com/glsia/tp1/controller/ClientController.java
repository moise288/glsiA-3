package com.glsia.tp1.controller;


import com.glsia.tp1.models.Client;
import com.glsia.tp1.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.ClientInfoStatus;
import java.util.List;

@Controller
@RequestMapping("/index")
public class ClientController {
   @Autowired
    private ClientService clientService;

   @GetMapping("/users")
    public String showClientList(Model model){
       List<Client> ListClient = clientService.listAll();
       model.addAttribute("ListClient",ListClient);
       return  "users";

   }

   @GetMapping("/users/ajouter")
    public String ShowNewForm(Model model){
       model.addAttribute("client",new Client());

       return "ajouterClient";
   }


}
