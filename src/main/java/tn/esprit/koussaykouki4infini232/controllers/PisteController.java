package tn.esprit.koussaykouki4infini232.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.koussaykouki4infini232.entities.Inscription;
import tn.esprit.koussaykouki4infini232.entities.Piste;
import tn.esprit.koussaykouki4infini232.services.IInscriptionServices;
import tn.esprit.koussaykouki4infini232.services.IPisteServices;

import java.util.List;

@RestController
@RequestMapping("/api/piste")
public class PisteController {

    @Autowired
    private IPisteServices pisteServices;

    @GetMapping("/{inscriId}")
    public ResponseEntity<Piste> getCoursById(@PathVariable Long coursId) {
        Piste inscription = pisteServices.retrievePiste(coursId);
        return ResponseEntity.ok(inscription);
    }

    @GetMapping
    public ResponseEntity<List<Piste>> getAllClaims() {
        List<Piste> pistes = pisteServices.retrieveAllPistes();
        return ResponseEntity.ok(pistes);
    }

    @PostMapping
    public ResponseEntity<Piste> saveClaim(@RequestBody Piste piste) {
        Piste savedClaim = pisteServices.addPiste(piste);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedClaim);
    }
    @DeleteMapping("/{inscriId}")
    public ResponseEntity<Void> deletePiste(@PathVariable Long claimId) {
        pisteServices.deletePiste(claimId);
        return ResponseEntity.noContent().build();
    }
}
