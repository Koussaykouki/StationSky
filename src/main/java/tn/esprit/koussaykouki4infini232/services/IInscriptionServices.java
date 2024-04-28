package tn.esprit.koussaykouki4infini232.services;

import tn.esprit.koussaykouki4infini232.entities.Cours;
import tn.esprit.koussaykouki4infini232.entities.Inscription;

import java.util.List;

public interface IInscriptionServices {
    List<Inscription> retrieveAllInscriptions();
    Inscription addInscription(Inscription inscription);
    Inscription retreiveInscription(Long numInscription);
    void deleteInscription(Long numInscription);
    Inscription addRegistrationAndAssignToSkier(Inscription inscription, Long numSkieur);
    Inscription assignRegistrationToCourse(Long numInscription, Long numCours);
}
