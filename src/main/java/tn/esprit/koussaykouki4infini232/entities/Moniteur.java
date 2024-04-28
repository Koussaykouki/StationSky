package tn.esprit.koussaykouki4infini232.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name="Moniteur")
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMoniteur ;
    private String nomM;
    private String prenomM;
    private LocalDate dateRecru;
    @OneToMany
    Set<Cours> courses;


}
