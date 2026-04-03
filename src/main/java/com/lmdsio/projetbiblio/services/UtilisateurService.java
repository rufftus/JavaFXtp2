package com.lmdsio.projetbiblio.services;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.lmdsio.projetbiblio.models.Utilisateur;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilisateurService extends DbService{
    static private Utilisateur user=null;

    public Utilisateur getUser(){
        return user;
    }

    public boolean signIn(String login, String password) throws Exception{
        boolean ok=false;
        try{
            dbConnect();
            ResultSet rs =dbQuery("SELECT * from utilisateur where login =?",login,null);
            while(rs.next()){
                String hash =rs.getString("password");
                if (BCrypt.verifyer().verify(password.toCharArray(),hash).verified){
                    user=new Utilisateur(rs.getString("login"));
                    user.setNom(rs.getString("nom"));
                    user.setPrenom(rs.getString("prenom"));
                    user.setCompte(rs.getString("compte").charAt(0));
                }
            }
            dbClose();
        }catch (SQLException e){
            throw new Exception("Problème d'accès aux identifiants !");
        }
        return ok;
    }

    public boolean signOut(){
        user=null;
        return true;
    }

}
