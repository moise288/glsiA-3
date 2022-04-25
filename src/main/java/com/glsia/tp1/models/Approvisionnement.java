package com.glsia.tp1.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Approvisionnement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;

    private Integer Quantite;

    LocalDate dateApprov;

    @ManyToOne()
    @JoinColumn(name = "produit_id", insertable = false, updatable = false)

    private Produit produit;

    private int produit_id;

    public Approvisionnement(Produit produit) {
        this.produit = produit;
    }

    public int getProduit_id() {
        return produit_id;
    }

    public Integer getId() {
        return id;
    }

    public Integer getQuantite() {
        return Quantite;
    }

    public LocalDate getDateApprov() {
        return dateApprov;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuantite(Integer quantite) {
        Quantite = quantite;
    }

    public void setDateApprov(LocalDate dateApprov) {
        this.dateApprov = dateApprov;
    }
}
