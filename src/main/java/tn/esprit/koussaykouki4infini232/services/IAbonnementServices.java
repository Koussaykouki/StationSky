package tn.esprit.koussaykouki4infini232.services;

import tn.esprit.koussaykouki4infini232.entities.Abonnement;
import tn.esprit.koussaykouki4infini232.entities.Cours;

import java.util.List;

public interface IAbonnementServices {
    List<Abonnement> retrieveAllAbonnements();
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement(Abonnement abonnement);
    Abonnement retreiveAbonnement(Long numAbonnement);
}
