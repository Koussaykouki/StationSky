package tn.esprit.koussaykouki4infini232.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.util.Set;

@Data
@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private int longeure ;
    private int pente ;
    @ManyToMany
    Set<Skieur>skieurs;

}
