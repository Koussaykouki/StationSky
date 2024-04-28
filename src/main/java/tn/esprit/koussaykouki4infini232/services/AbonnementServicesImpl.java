package tn.esprit.koussaykouki4infini232.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.koussaykouki4infini232.entities.Abonnement;
import tn.esprit.koussaykouki4infini232.entities.Cours;
import tn.esprit.koussaykouki4infini232.repositories.IAbonnementRepository;

import java.util.List;
@RequiredArgsConstructor
@Service
public class AbonnementServicesImpl implements IAbonnementServices {
    private final IAbonnementRepository abonnementRepository ;
    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return null;
    }


    @Override
    public Abonnement retreiveAbonnement(Long numAbonnement) {
        return abonnementRepository.findById(numAbonnement).orElse(null);
    }
}
