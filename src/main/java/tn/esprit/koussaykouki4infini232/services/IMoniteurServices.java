package tn.esprit.koussaykouki4infini232.services;

import tn.esprit.koussaykouki4infini232.entities.Moniteur;
import tn.esprit.koussaykouki4infini232.entities.Support;

import java.util.List;
import java.util.Optional;

public interface IMoniteurServices {
    List<Moniteur> retreiveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur(Moniteur moniteur);
    Optional<Moniteur> retrieveMoniteur(Long numMoniteur);
    void assigntInstToCourse(Long numCourse , Long numInst);
    Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCours);

    Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Support support);
}
