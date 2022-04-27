package com.glsia.tp1.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String NonClient;
    private String PrenonClient;
    private String AdresseClient;
    private Integer Telephone;

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNonClient() {
        return NonClient;
    }

    public void setNonClient(String nonClient) {
        NonClient = nonClient;
    }

    public String getPrenonClient() {
        return PrenonClient;
    }

    public void setPrenonClient(String prenonClient) {
        PrenonClient = prenonClient;
    }

    public String getAdresseClient() {
        return AdresseClient;
    }

    public void setAdresseClient(String adresseClient) {
        AdresseClient = adresseClient;
    }

    public Integer getTelephone() {
        return Telephone;
    }

    public void setTelephone(Integer telephone) {
        Telephone = telephone;
    }
}
