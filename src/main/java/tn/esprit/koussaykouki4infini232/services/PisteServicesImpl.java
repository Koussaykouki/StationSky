package tn.esprit.koussaykouki4infini232.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.koussaykouki4infini232.entities.Piste;
import tn.esprit.koussaykouki4infini232.entities.Skieur;
import tn.esprit.koussaykouki4infini232.repositories.IPisteRepository;
import tn.esprit.koussaykouki4infini232.repositories.ISkieurRepository;

import java.util.HashSet;
import java.util.List;
@RequiredArgsConstructor
@Service
public class PisteServicesImpl implements IPisteServices {
    private final ISkieurRepository skieurRepository;
    private final IPisteRepository pisteRepository;

    @Override
    public List<Piste> retrieveAllPistes() {
        return (List<Piste>) pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return null;
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
  public  Piste assignSkierToPiste(Long numSkieur, Long numPiste) {
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        if (piste.getSkieurs() == null) {
            piste.setSkieurs(new HashSet<>());
            piste.getSkieurs().add(skieur);
        }else piste.getSkieurs().add(skieur);
        pisteRepository.save(piste);
        return piste ;
    }

    @Override
    public void deletePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);
    }
}
