package com.glsia.tp1.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ventes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idVente;

    @ManyToOne()
    @JoinColumn(name = "IdClient", insertable = false, updatable = false)
    private Client client;

    private int ClientId;

    @ManyToOne()
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Produit produit;

    private int ProduitId;

    private int qteVendue;

    private LocalDate dateVente;



    public int getIdVente() {
        return idVente;
    }

    public void setIdVente(int idVente) {
        this.idVente = idVente;
    }

    public int getClientId() {
        return ClientId;
    }

    public void setClientId(int clientId) {
        ClientId = clientId;
    }

    public int getProduitId() {
        return ProduitId;
    }

    public void setProduitId(int produitId) {
        ProduitId = produitId;
    }

    public int getQteVendue() {
        return qteVendue;
    }

    public void setQteVendue(int qteVendue) {
        this.qteVendue = qteVendue;
    }

    public LocalDate getDateVente() {
        return dateVente;
    }

    public void setDateVente(LocalDate dateVente) {
        this.dateVente = dateVente;
    }
}
