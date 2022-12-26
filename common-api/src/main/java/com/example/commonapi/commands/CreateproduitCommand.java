package com.example.commonapi.commands;


import com.example.commonapi.enums.Etat;
import lombok.Getter;

public class CreateInfractionCommand extends BaseCommand<String> {
    @Getter private String nom;
    @Getter private double prix;
    @Getter private int qteStock;
    @Getter private Etat etat;


    public CreateInfractionCommand(String nom, double prix, int qteStock, Etat etat) {
        this.nom = nom;
        this.prix = prix;
        this.qteStock = qteStock;
        this.etat = etat;
    }
}
