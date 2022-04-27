package com.glsia.tp1.service;

import com.glsia.tp1.models.Client;
import com.glsia.tp1.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    //Injection de dépendance de repository dans service
    @Autowired
    private ClientRepository clientRepository;

    //Enregistrer un client dans la base
    public void saveClient(Client client)
    {
        clientRepository.save(client);
    }

    public List<Client> showAllClient()
    {
        return clientRepository.findAll();
    }

    public Client selectOneClient(int id)
    {
        return clientRepository.findById(id).get();
    }

    public void deleteClient(int id)
    {
        clientRepository.deleteById(id);
    }

    //selectionner un seul client
    public Client selectedClient(int id)
    {
        Optional<Client> optional = clientRepository.findById(id);
        Client client = null;
        if(optional.isPresent())
        {
            client = optional.get();
        }else
        {
            throw new RuntimeException("id introuvable");
        }
        return  client;
    }


}
