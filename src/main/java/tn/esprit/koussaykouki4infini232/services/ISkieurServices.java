package tn.esprit.koussaykouki4infini232.services;

import org.springframework.data.repository.query.Param;
import tn.esprit.koussaykouki4infini232.entities.Skieur;
import tn.esprit.koussaykouki4infini232.entities.TypeAbonnement;

import java.util.List;

public interface ISkieurServices {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    void removeSkieur(Long numSkieur);
    Skieur retrieveSkieur(Long numSkieur);
    Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCours);
    List<Skieur> retrieveSkiersBySubscriptionType( TypeAbonnement typeAbonnement);
     void retrieveSkieurPeriod();

}
