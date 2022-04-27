package com.glsia.tp1.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Client")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int IdClient;
    private String nomClient;
    private String PrenomClient;
    private String adresseClient;
    private int Telephone;
    private LocalDate dateEnregistre;

    public LocalDate getDateEnregistre() {
        return dateEnregistre;
    }

    public void setDateEnregistre(LocalDate dateEnregistre) {
        this.dateEnregistre = dateEnregistre;
    }

    public int getIdClient() {
        return IdClient;
    }

    public void setIdClient(int id) {
        this.IdClient = id;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return PrenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        PrenomClient = prenomClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int telephone) {
        Telephone = telephone;
    }
}
