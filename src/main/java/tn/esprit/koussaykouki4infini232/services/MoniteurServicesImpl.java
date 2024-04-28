package tn.esprit.koussaykouki4infini232.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.koussaykouki4infini232.entities.Cours;
import tn.esprit.koussaykouki4infini232.entities.Moniteur;
import tn.esprit.koussaykouki4infini232.entities.Support;
import tn.esprit.koussaykouki4infini232.repositories.ICoursRepository;
import tn.esprit.koussaykouki4infini232.repositories.IMoniteurRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MoniteurServicesImpl implements IMoniteurServices {
    private final IMoniteurRepository moniteurRepository;
    private final ICoursRepository coursRepository;

    @Override
    public List<Moniteur> retreiveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return null;
    }

    @Override
    public Optional<Moniteur> retrieveMoniteur(Long numMoniteur) {
        return moniteurRepository.findById(numMoniteur);
    }

    @Override
    public void assigntInstToCourse(Long numCourse, Long numInst) {
Cours cours = coursRepository.findById(numCourse).orElse(null);
Moniteur moniteur = moniteurRepository.findById(numInst).orElse(null);
if(moniteur.getCourses()==null)
{
    moniteur.setCourses(new HashSet<>());
    moniteur.getCourses().add(cours);
}
else moniteur.getCourses().add(cours);
moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCours) {
        Cours cours = coursRepository.findById(numCours).orElse(null);
        if(moniteur.getCourses()==null) {
            moniteur.setCourses(new HashSet<>());
            moniteur.getCourses().add(cours);
        }else  moniteur.getCourses().add(cours);
return moniteurRepository.save(moniteur);
    }
    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Support support) {
        List<Cours> coursList = coursRepository.findBySupport(support);
        for(Cours cours :coursList){
         moniteur.getCourses().add(cours);
        }
        return moniteurRepository.save(moniteur);
    }

}
