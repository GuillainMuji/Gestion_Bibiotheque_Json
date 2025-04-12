package org.example.data;

import java.util.List;
import java.util.stream.Collectors;

public class Bibliothecaire extends Utilisateur {
    public Bibliothecaire(int id, String nom, String motDePasse) {
        super(id, nom, motDePasse, "bibliothecaire");
    }

    public void ajouterLivre(Bibliotheque biblio, Livre livre) {
        biblio.getLivres().add(livre);
        System.out.println("Livre ajouté : " + livre);
    }

    public void supprimerLivre(Bibliotheque biblio, int idLivre) {
        biblio.getLivres().removeIf(l -> l.getId() == idLivre);
        System.out.println("Livre supprimé : ID " + idLivre);
    }

    public Livre rechercherLivre(Bibliotheque biblio, String titre) {
        return biblio.getLivres().stream()
                .filter(livre -> livre.getTitre().equalsIgnoreCase(titre))
                .findFirst()
                .orElse(null);
    }

    public void listerLivres(Bibliotheque biblio) {
        System.out.println("Liste des livres :");
        for (Livre livre : biblio.getLivres()) {
            System.out.println(livre);
        }
    }

    public List<Livre> rechercherParCategorie(Bibliotheque biblio, String nomCategorie) {
        return biblio.getLivres().stream()
                .filter(livre -> livre.getCategorie() != null && livre.getCategorie().getNom().equalsIgnoreCase(nomCategorie))
                .collect(Collectors.toList());
    }
}
