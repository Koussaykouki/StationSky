package tn.esprit.koussaykouki4infini232.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.koussaykouki4infini232.entities.Cours;
import tn.esprit.koussaykouki4infini232.entities.Moniteur;
import tn.esprit.koussaykouki4infini232.entities.Skieur;

import java.util.List;

public interface IMoniteurRepository extends JpaRepository<Moniteur, Long> {

}
