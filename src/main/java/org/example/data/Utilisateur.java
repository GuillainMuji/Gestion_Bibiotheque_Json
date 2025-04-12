package org.example.data;

public class Utilisateur {
    private int id;
    private String nom;
    private String motDePasse;
    private String role;

    public Utilisateur(int id, String nom, String motDePasse, String role) {
        this.id = id;
        this.nom = nom;
        this.motDePasse = motDePasse;
        this.role = role;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getMotDePasse() { return motDePasse; }
    public String getRole() { return role; }

    public void setId(int id) { this.id = id; }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
