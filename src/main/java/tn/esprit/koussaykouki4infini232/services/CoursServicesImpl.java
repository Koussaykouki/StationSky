package tn.esprit.koussaykouki4infini232.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.koussaykouki4infini232.entities.Cours;
import tn.esprit.koussaykouki4infini232.repositories.ICoursRepository;

import java.util.List;
@RequiredArgsConstructor
@Service
public class CoursServicesImpl implements ICoursServices {
private final ICoursRepository coursRepository ;
    @Override
    public List<Cours> retrieveAllCourses() {
        return coursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return null;
    }

    @Override
    public Cours retreiveCours(Long numCours) {
        return coursRepository.findById(numCours).orElse(null);
    }

    @Override
    public void deleteCours(Long numCours) {
        coursRepository.deleteById(numCours);
    }
}
