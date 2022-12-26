package com.example.commonapi.events;


import lombok.Getter;

public class ClientCreatedEvent extends BaseEvent<String> {
    @Getter private String nom;
    @Getter private String addresse;
    @Getter private String addresse;
    @Getter private String tel;


    public ClientCreatedEvent(String nom, String addresse, mail addresse1, String tel) {
        this.nom = nom;
        this.addresse = addresse;
        this.addresse = addresse1;
        this.tel = tel;
    }
}
