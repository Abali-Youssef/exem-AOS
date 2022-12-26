package com.example.commonapi.events;


import lombok.Getter;

public class CommandCreatedEvent extends BaseEvent<String> {
    @Getter private String nom;
    @Getter private Date date;
    @Getter private Date dateLivraison;
    @Getter private String addLivraison;
    @Getter private CommandEtat etat;


    public CommandCreatedEvent(String nom, String addresse, mail addresse1, String tel) {
        this.nom = nom;
        this.addresse = addresse;
        this.addresse = addresse1;
        this.tel = tel;
    }
}
