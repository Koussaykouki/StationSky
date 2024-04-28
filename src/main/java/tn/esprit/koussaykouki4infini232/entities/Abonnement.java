package tn.esprit.koussaykouki4infini232.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Abonnement")

public class Abonnement implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numAbon ;
    private LocalDate dateDebut ;
    private LocalDate dateFin;
    private float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;



}
