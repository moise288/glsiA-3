package com.glsia.tp1.controller;

import com.glsia.tp1.models.Produit;
import com.glsia.tp1.models.User;
import com.glsia.tp1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping("/user")
public class UserController {


    //Injection de dépendance de service dans controller
    @Autowired
    private UserService userService;

    @GetMapping("/show")
    public String afficherUser(Model model)
    {
        model.addAttribute("listUser", userService.showAllUser());
        return "user/showUser";
    }

    @GetMapping("/create")
    public String AfficherFormulaire(Model model)
    {

        return "user/formUser";
    }

    @PostMapping("/save")
    public String save(User user)
    {

        userService.saveUser(user);
        return "redirect:/user/show";
    }

    @GetMapping("/edit/{id}")
    public String formEditUser(@PathVariable("id") int id, Model model)
    {
        model.addAttribute("unUser", userService.selectedUser(id));

        return "user/formEditUser";
    }

    @PostMapping("/edit")
    public String editUser(@ModelAttribute("user") User user ){
        userService.saveUser(user);
        return "redirect:/user/show";
    }

    @GetMapping("delete/{id}")
    public String deleteUser(@PathVariable("id") int id)
    {
        userService.deleteUser(id);
        return "redirect:/user/show";
    }





}
