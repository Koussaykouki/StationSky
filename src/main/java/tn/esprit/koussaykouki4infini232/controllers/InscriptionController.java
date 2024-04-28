package tn.esprit.koussaykouki4infini232.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.koussaykouki4infini232.entities.Cours;
import tn.esprit.koussaykouki4infini232.entities.Inscription;
import tn.esprit.koussaykouki4infini232.services.ICoursServices;
import tn.esprit.koussaykouki4infini232.services.IInscriptionServices;

import java.util.List;

@RestController
@RequestMapping("/api/inscription")
public class InscriptionController {

    @Autowired
    private IInscriptionServices inscriptionServices;

    @GetMapping("/{inscriId}")
    public ResponseEntity<Inscription> getInscriptionById(@PathVariable Long coursId) {
        Inscription inscription = inscriptionServices.retreiveInscription(coursId);
        return ResponseEntity.ok(inscription);
    }

    @GetMapping
    public ResponseEntity<List<Inscription>> getAllInscriptions() {
        List<Inscription> Inscription = inscriptionServices.retrieveAllInscriptions();
        return ResponseEntity.ok(Inscription);
    }

    @PostMapping
    public ResponseEntity<Inscription> saveInscription(@RequestBody Inscription inscription) {
        Inscription savedClaim = inscriptionServices.addInscription(inscription);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedClaim);
    }
    @DeleteMapping("/{inscriId}")
    public ResponseEntity<Void> deleteInscription(@PathVariable Long claimId) {
        inscriptionServices.deleteInscription(claimId);
        return ResponseEntity.noContent().build();
    }
    @PostMapping("/save/{numSkier}")
    public Inscription addAndAssignToSkier(@RequestBody Inscription inscription , @PathVariable Long numSkier)
    {
        return inscriptionServices.addRegistrationAndAssignToSkier(inscription , numSkier);
    }
    @PostMapping("/{numInscri}/{numCours}")
    public Inscription assignToCourse(@PathVariable Long numInscri , @PathVariable Long numCours)
    {
        return inscriptionServices.assignRegistrationToCourse(numInscri ,numCours);

    }
}
