package tn.esprit.koussaykouki4infini232.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.koussaykouki4infini232.entities.Cours;
//import tn.esprit.koussaykouki4infini232.entities.CoursRepository;
import tn.esprit.koussaykouki4infini232.entities.Inscription;
import tn.esprit.koussaykouki4infini232.entities.Skieur;
import tn.esprit.koussaykouki4infini232.repositories.IInscriptionRepository;
import tn.esprit.koussaykouki4infini232.repositories.ISkieurRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class InscriptionServicesImpl implements IInscriptionServices {
    private final IInscriptionRepository inscriptionRepository;
    private final ISkieurRepository iSkieurRepository;
    //private final CoursRepository coursRepository;

    @Override
    public List<Inscription> retrieveAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription retreiveInscription(Long numInscription) {
        return inscriptionRepository.findById(numInscription).orElse(null);
    }

    @Override
    public void deleteInscription(Long numInscription) {
inscriptionRepository.deleteById(numInscription);
    }

    @Override
    public Inscription addRegistrationAndAssignToSkier(Inscription inscription, Long numSkieur) {
        Skieur skieur = iSkieurRepository.findById(numSkieur).orElse(null);
        inscription.setSkieur(skieur);
        return inscriptionRepository.save(inscription);
    }

//    @Override
    public Inscription assignRegistrationToCourse(Long numInscription, Long numCours) {
//        Inscription inscription = inscriptionRepository.findById(numInscription).orElse(null);
//        Cours cours = coursRepository.findById(numCours).orElse(null);
//        inscription.setCours(cours);
//        return  inscriptionRepository.save(inscription);
return null ;
//
   }
}
