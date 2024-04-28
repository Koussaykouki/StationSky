package tn.esprit.koussaykouki4infini232.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.koussaykouki4infini232.entities.Skieur;
import tn.esprit.koussaykouki4infini232.entities.TypeAbonnement;

import java.util.List;

public interface ISkieurRepository extends JpaRepository<Skieur,Long> {
    @Query("select s  from Skieur s where s.abonnement.typeAbon =:typeAbonnement ")
    List<Skieur> retrieveSkiersBySubscriptionType(@Param("typeAbonnement") TypeAbonnement typeAbonnement);
    @Query("select s from Skieur s where s.abonnement.dateFin<CURRENT_DATE ")
    List<Skieur> getByExpiredSubscription();
}
