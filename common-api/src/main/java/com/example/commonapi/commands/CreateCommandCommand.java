package com.example.commonapi.commands;


import lombok.Getter;

public class CreateCommandCommand extends BaseCommand<String> {
    @Getter private String nom;
    @Getter private Date date;
    @Getter private Date dateLivraison;
    @Getter private String addLivraison;
    @Getter private CommandEtat etat;


    public CreateCommandCommand(String nom, String addresse, mail addresse1, String tel) {
        this.nom = nom;
        this.addresse = addresse;
        this.addresse = addresse1;
        this.tel = tel;
    }
}
