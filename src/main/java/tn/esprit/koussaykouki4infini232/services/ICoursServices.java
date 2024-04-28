package tn.esprit.koussaykouki4infini232.services;

import tn.esprit.koussaykouki4infini232.entities.Cours;

import java.util.List;

public interface ICoursServices {
    List<Cours> retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours(Cours cours);
    Cours retreiveCours(Long numCours);
    void deleteCours(Long numCours);
}
