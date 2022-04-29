package com.glsia.tp1.service;

import com.glsia.tp1.models.Produit;
import com.glsia.tp1.models.User;
import com.glsia.tp1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    //Injection de dépendance de repository dans service
    @Autowired
    private UserRepository userRepository;

    //Enregistrer un user dans la base
    public void saveUser(User user)
    {
       userRepository.save(user);
    }

    //Afficher les users
    public List<User> showAllUser()
    {
        return userRepository.findAll();
    }

    //selectionner un seul user
    public User selectedUser(int id)
    {
        Optional<User> optional = userRepository.findById(id);
        User user = null;
        if(optional.isPresent())
        {
            user = optional.get();
        }else
        {
            throw new RuntimeException("id introuvable");
        }
        return  user;
    }

    //supprimer un user
    public void deleteUser(int id){
        if (selectedUser(id) != null) {
            userRepository.deleteById(id);
        }
    }



}
