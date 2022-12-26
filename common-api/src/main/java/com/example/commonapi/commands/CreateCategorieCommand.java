package com.example.commonapi.commands;


import lombok.Getter;

public class CreateCategorieCommand extends BaseCommand<String> {
    @Getter private String nom;
    @Getter private String addresse;
    @Getter private String addresse;
    @Getter private String tel;


    public CreateCategorieCommand(String nom, String addresse, mail addresse1, String tel) {
        this.nom = nom;
        this.addresse = addresse;
        this.addresse = addresse1;
        this.tel = tel;
    }
}
