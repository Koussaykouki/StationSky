package tn.esprit.koussaykouki4infini232.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name="Inscription")
public class Inscription  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInscription;
    private int numSemaine;
    @JsonIgnore
    @ManyToOne
    private Skieur skieur;
    @JsonIgnore
    @ManyToOne
    private Cours cours ;

}
