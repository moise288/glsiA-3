package com.glsia.tp1.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "produits")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String libelle;
    private int qteStok;
    private int qteSeuil;
    private double prix;
    private LocalDate dateCreation;

    @ManyToOne()
    @JoinColumn(name = "categoryId", insertable = false, updatable = false)
    private Category category;

    private int categoryId;

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getQteStok() {
        return qteStok;
    }

    public int getQteSeuil() {
        return qteSeuil;
    }

    public double getPrix() {
        return prix;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public Category getCategory() {
        return category;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setQteStok(int qteStok) {
        this.qteStok = qteStok;
    }

    public void setQteSeuil(int qteSeuil) {
        this.qteSeuil = qteSeuil;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
