package tn.esprit.koussaykouki4infini232.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.koussaykouki4infini232.entities.Piste;
import tn.esprit.koussaykouki4infini232.entities.Skieur;
import tn.esprit.koussaykouki4infini232.entities.TypeAbonnement;
import tn.esprit.koussaykouki4infini232.services.IPisteServices;
import tn.esprit.koussaykouki4infini232.services.ISkieurServices;

import java.util.List;

@RestController
@RequestMapping("/api/skieur")
public class SkieurController {

    @Autowired
    private ISkieurServices skieurServices;

    @GetMapping("/{inscriId}")
    public ResponseEntity<Skieur> getSkieurById(@PathVariable Long skieurId) {
        Skieur skieur = skieurServices.retrieveSkieur(skieurId);
        return ResponseEntity.ok(skieur);
    }

    @GetMapping
    public ResponseEntity<List<Skieur>> getAllSkieurs() {
        List<Skieur> skieurs = skieurServices.retrieveAllSkieurs();
        return ResponseEntity.ok(skieurs);
    }

    @PostMapping
    public ResponseEntity<Skieur> saveClaim(@RequestBody Skieur skieur) {
        Skieur savedClaim = skieurServices.addSkieur(skieur);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedClaim);
    }
    @DeleteMapping("/{inscriId}")
    public ResponseEntity<Void> deletePiste(@PathVariable Long claimId) {
        skieurServices.removeSkieur(claimId);
        return ResponseEntity.noContent().build();
    }
    @PostMapping("/addandassign/{numCours}")
    public Skieur addSkierAndAssignToCourse(@RequestBody Skieur skieur,@PathVariable Long numCours) {
        return skieurServices.addSkierAndAssignToCourse(skieur,numCours);

    }
    @GetMapping("/getbyabo/{typeAbonnement}")
    public List<Skieur> retrieveSkierBySubscriptionType(@PathVariable TypeAbonnement typeAbonnement)
    {
        return skieurServices.retrieveSkiersBySubscriptionType(typeAbonnement);
    }
}