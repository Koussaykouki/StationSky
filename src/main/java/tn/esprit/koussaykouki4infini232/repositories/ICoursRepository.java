package tn.esprit.koussaykouki4infini232.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.koussaykouki4infini232.entities.Cours;
import tn.esprit.koussaykouki4infini232.entities.Support;

import java.util.List;

public interface ICoursRepository extends JpaRepository<Cours, Long> {
List<Cours> findBySupport(Support support);
}
