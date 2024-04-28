package tn.esprit.koussaykouki4infini232.services;

import tn.esprit.koussaykouki4infini232.entities.Piste;
import tn.esprit.koussaykouki4infini232.entities.Skieur;

import java.util.List;

public interface IPisteServices {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste  piste);
    Piste updatePiste (Piste piste);
    Piste retrievePiste(Long numPiste);
    Piste assignSkierToPiste(Long numSkieur, Long numPiste);
    void deletePiste(Long numPiste);
}
