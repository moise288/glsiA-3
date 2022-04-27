package com.glsia.tp1.service;

import com.glsia.tp1.models.Vente;
import com.glsia.tp1.repository.VenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VenteService {

    @Autowired
    private VenteRepository venteRepository;


    //Enregistrer une vente dans la base
    public void saveVente(Vente vente)
    {
        venteRepository.save(vente);
    }


    public List<Vente> showAllVente()
    {
        return venteRepository.findAll();
    }

    public Vente selectOneVente(int id)
    {
        return venteRepository.findById(id).get();
    }

    public void deleteVente(int id)
    {
        venteRepository.deleteById(id);
    }

    //selectionner une seule vente
    public Vente selectedVente(int id)
    {
        Optional<Vente> optional = venteRepository.findById(id);
        Vente vente = null;
        if(optional.isPresent())
        {
            vente = optional.get();
        }else
        {
            throw new RuntimeException("id introuvable");
        }
        return  vente;
    }




}
