package tn.esprit.koussaykouki4infini232.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name="COURS")
public class Cours implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;
    private Integer niveau;
    private TypeCours typeCours;
    private Support support;
    private float prix;
    private Integer creneau;
    @OneToMany(mappedBy = "cours")
    Set<Inscription> inscriptions;
}
