package com.glsia.tp1.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ventes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String nomProduit;
    private int qteProduit;
    private int prixProduit;

    @ManyToOne()
    @JoinColumn(name = "produitId", insertable = false, updatable = false)
    private Produit produit;

}
