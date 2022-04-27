package com.glsia.tp1.service;

import com.glsia.tp1.models.Client;
import com.glsia.tp1.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository ClientRepository;

    //Enregistrer un client  dans la base
    public void saveClient(Client client) {
        ClientRepository.save(client);
    }

    public List<Client> listAll(){
        return (List<Client>) ClientRepository.findAll();
    }

}