package com.lmdsio.projetbiblio.models;

public class Utilisateur {
    private String login, password;
    private String nom, prenom;
    private char compte;

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public char getCompte(){
        return compte;
    }

    public void setCompte(char compte){
        this.compte = compte;
    }


    public Utilisateur(String login){

    }


}
