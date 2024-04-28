package tn.esprit.koussaykouki4infini232.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.koussaykouki4infini232.entities.Cours;
import tn.esprit.koussaykouki4infini232.entities.Inscription;
import tn.esprit.koussaykouki4infini232.entities.Skieur;
import tn.esprit.koussaykouki4infini232.entities.TypeAbonnement;
import tn.esprit.koussaykouki4infini232.repositories.ICoursRepository;
import tn.esprit.koussaykouki4infini232.repositories.IInscriptionRepository;
import tn.esprit.koussaykouki4infini232.repositories.ISkieurRepository;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service

public class SkieurServicesImpl implements  ISkieurServices {
    private final ISkieurRepository skieurRepository;
    private final ICoursRepository coursRepository;
    private final IInscriptionRepository inscriptionRepository ;

    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void removeSkieur(Long numSkieur) {
        skieurRepository.deleteById(numSkieur);

    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur).orElse(null);
    }

    @Override
    public Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCours) {
        Cours cours = coursRepository.findById(numCours).orElse(null);
        Skieur skieur1 = skieurRepository.save(skieur);
        for(Inscription inscription : skieur.getInscriptionsc()) {
            inscription.setSkieur(skieur1);
            inscription.setCours(cours);
            inscriptionRepository.save(inscription);
        }
        return skieur1;
        }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return skieurRepository.retrieveSkiersBySubscriptionType(typeAbonnement);
    }
    @Override
    @Scheduled(cron ="*/15 * * * * *" )
    public void retrieveSkieurPeriod() {
        log.debug("in retrieve ");
       for (Skieur s:skieurRepository.getByExpiredSubscription())
           log.info(s.toString());
    }

}

