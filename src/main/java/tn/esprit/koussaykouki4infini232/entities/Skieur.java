package tn.esprit.koussaykouki4infini232.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name="SKIEUR")
public class Skieur implements Serializable {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
         Long numSkieur;
     @Column(nullable = false)
         String nomS;

    @Override
    public String toString() {
        return "Skieur{" +
                "numSkieur=" + numSkieur +
                ", nomS='" + nomS + '\'' +
                ", prenomS='" + prenomS + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", ville='" + ville + '\'' +
                ", age=" + age +
                ", abonnement=" + abonnement +
                ", inscriptionsc=" + inscriptionsc +
                ", pistes=" + pistes +
                '}';
    }

    String prenomS;
         LocalDate dateOfBirth;
         String ville;
    @Transient
         int age;
     @OneToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST})

          private Abonnement abonnement;
     @OneToMany(mappedBy ="skieur")
    Set<Inscription> inscriptionsc;
     @ManyToMany(mappedBy = "skieurs")
    Set<Piste> pistes;



}
