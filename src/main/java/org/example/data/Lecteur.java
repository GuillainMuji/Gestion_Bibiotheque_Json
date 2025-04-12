package org.example.data;

public class Lecteur extends Utilisateur {
    public Lecteur(int id, String nom, String motDePasse) {
        super(id, nom, motDePasse, "lecteur");
    }

    public void emprunterLivre(Livre livre) {
        livre.setDisponible(false);
        System.out.println("📕 Livre emprunté : " + livre.getTitre());
    }

    public void retournerLivre(Livre livre) {
        livre.setDisponible(true);
        System.out.println("📗 Livre retourné : " + livre.getTitre());
    }

    @Override
    public String toString() {
        return "Lecteur{" +
                "id=" + getId() +
                ", nom='" + getNom() + '\'' +
                ", motDePasse='" + getMotDePasse() + '\'' +
                ", role='" + getRole() + '\'' +
                '}';
    }
}
