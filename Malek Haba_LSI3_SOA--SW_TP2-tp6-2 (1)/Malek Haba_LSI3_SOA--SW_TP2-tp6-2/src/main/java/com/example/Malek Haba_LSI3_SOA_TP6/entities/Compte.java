package com.example.MbarekAmine_LSI3_SOA_TP6.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Compte {

    // Unique identifier for the Compte entity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Balance of the Compte
    private double solde;

    // Date of creation for the Compte
    private Date dateCreation;

    // Type of the Compte (e.g., EPARGNE, COURANT)
    private TypeCompte type;

    // State of the Compte (e.g., ACTIVE, CLOSED)
    private EtatCompte etat;

    // Getter and setter methods for the Compte attributes

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public TypeCompte getType() {
        return type;
    }

    public void setType(TypeCompte type) {
        this.type = type;
    }

    public EtatCompte getEtat() {
        return etat;
    }

    public void setEtat(EtatCompte etat) {
        this.etat = etat;
    }
}
