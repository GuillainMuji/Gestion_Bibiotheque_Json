package org.example.data;

import java.time.LocalDate;

public class Emprunt {
    private int utilisateurId;
    private int livreId;
    private String dateEmprunt;
    private String dateRetour;

    public Emprunt(int utilisateurId, int livreId) {
        this.utilisateurId = utilisateurId;
        this.livreId = livreId;
        this.dateEmprunt = LocalDate.now().toString();
    }

    public int getUtilisateurId() { return utilisateurId; }
    public int getLivreId() { return livreId; }
    public String getDateEmprunt() { return dateEmprunt; }
    public String getDateRetour() { return dateRetour; }

    public void setDateRetour(String dateRetour) { this.dateRetour = dateRetour; }

    @Override
    public String toString() {
        return "Emprunt{" +
                "utilisateurId=" + utilisateurId +
                ", livreId=" + livreId +
                ", dateEmprunt='" + dateEmprunt + '\'' +
                ", dateRetour='" + dateRetour + '\'' +
                '}';
    }
}
