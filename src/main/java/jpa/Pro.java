package jpa;

import jakarta.persistence.Entity;

@Entity
public class Pro extends User {
    private String entreprise;
    private String specialite;

    // Attributs spécifiques aux Pros

    public Pro() {
    }

    public Pro(String username, String email, String entreprise, String specialite) {
        super(username, email);
        this.entreprise = entreprise;
        this.specialite = specialite;
    }

    // Ajoutez les getters et setters pour les attributs spécifiques aux professionnels

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    // ToString pour affichage
    @Override
    public String toString() {
        return "Pro [id=" + getId() + ", username=" + getUsername() + ", email=" + getEmail()
                + ", entreprise=" + entreprise + ", specialite=" + specialite + "]";
    }
}
