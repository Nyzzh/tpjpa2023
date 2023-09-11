package jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;

    // On met d'autre attribut ? genre nom prenom etc ?

    @OneToMany(mappedBy = "client")
    private List<Rdv> rdvsEnTantQueClient;

    @OneToMany(mappedBy = "professionnel")
    private List<Rdv> rdvsEnTantQueProfessionnel;

    public User() {
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Getters et setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Rdv> getRdvsEnTantQueClient() {
        return rdvsEnTantQueClient;
    }

    public void setRdvsEnTantQueClient(List<Rdv> rdvsEnTantQueClient) {
        this.rdvsEnTantQueClient = rdvsEnTantQueClient;
    }

    public List<Rdv> getRdvsEnTantQueProfessionnel() {
        return rdvsEnTantQueProfessionnel;
    }

    public void setRdvsEnTantQueProfessionnel(List<Rdv> rdvsEnTantQueProfessionnel) {
        this.rdvsEnTantQueProfessionnel = rdvsEnTantQueProfessionnel;
    }

    // ToString pour affichage
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", email=" + email + "]";
    }
}
