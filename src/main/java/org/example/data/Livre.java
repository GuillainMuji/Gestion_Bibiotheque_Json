package org.example.data;

public class Livre {
    private int id;
    private String titre;
    private String auteur;
    private String isbn;
    private int annee;
    private Categorie categorie; // Catégorie liée au livre
    private boolean disponible = true;

    public Livre(int id, String titre, String auteur, String isbn, int annee) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.annee = annee;
        this.categorie = categorie;
    }

    public int getId() { return id; }
    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public String getIsbn() { return isbn; }
    public int getAnnee() { return annee; }
    public Categorie getCategorie() { return categorie; }
    public boolean isDisponible() { return disponible; }

    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", isbn='" + isbn + '\'' +
                ", annee=" + annee +
                ", categorie=" + (categorie != null ? categorie.getNom() : "Aucune") +
                ", disponible=" + disponible +
                '}';
    }
}
