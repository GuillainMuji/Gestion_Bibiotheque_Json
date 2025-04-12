package org.example.data;

public class Categorie extends Livre {
    private String nom;

    public Categorie(int id, String titre, String auteur, String isbn, int annee, String nom) {
        super(id, titre, auteur, isbn, annee); // Passer null pour la catégorie, car on la définit ici
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "nom='" + nom + '\'' +
                ", livre=" + super.toString() + // Appel à la méthode toString() de Livre
                '}';
    }
}

