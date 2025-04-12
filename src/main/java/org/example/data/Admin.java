package org.example.data;

import java.util.List;

public class Admin extends Utilisateur {
    public Admin(int id, String nom, String motDePasse) {
        super(id, nom, motDePasse, "admin");
    }

    public void creerBibliothecaire(Bibliotheque biblio, String nom, String email) {
        int id = biblio.getUtilisateurs().size() + 1;
        Bibliothecaire bibliothecaire = new Bibliothecaire(id, nom, email);
        biblio.getUtilisateurs().add(bibliothecaire);
        System.out.println("Bibliothécaire créé : " + bibliothecaire);
    }

    public void creerLecteur(Bibliotheque biblio, String nom, String email) {
        int id = biblio.getUtilisateurs().size() + 1;
        Lecteur lecteur = new Lecteur(id, nom, email);
        biblio.getUtilisateurs().add(lecteur);
        System.out.println("Lecteur créé : " + lecteur);
    }

    public void listerUtilisateurs(Bibliotheque biblio) {
        System.out.println("Liste des utilisateurs :");
        for (Utilisateur u : biblio.getUtilisateurs()) {
            System.out.println(u);
        }
    }
}
