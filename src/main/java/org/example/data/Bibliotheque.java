package org.example.data;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Utilisateur> utilisateurs = new ArrayList<>();
    private List<Livre> livres = new ArrayList<>();
    private List<Emprunt> emprunts = new ArrayList<>();

    public List<Utilisateur> getUtilisateurs() { return utilisateurs; }
    public List<Livre> getLivres() { return livres; }
    public List<Emprunt> getEmprunts() { return emprunts; }

    public void ajouterEmprunt(Emprunt emprunt) {
        emprunts.add(emprunt);
    }
}
