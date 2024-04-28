package tn.esprit.koussaykouki4infini232.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.koussaykouki4infini232.entities.Cours;
import tn.esprit.koussaykouki4infini232.services.ICoursServices;

import java.util.List;

@RestController
@RequestMapping("/api/cours")
public class CoursController {

    @Autowired
    private ICoursServices coursService;

    @GetMapping("/{coursId}")
    public ResponseEntity<Cours> getCoursById(@PathVariable Long coursId) {
        Cours cours = coursService.retreiveCours(coursId);
        return ResponseEntity.ok(cours);
    }

    @GetMapping
    public ResponseEntity<List<Cours>> getAllClaims() {
        List<Cours> cours = coursService.retrieveAllCourses();
        return ResponseEntity.ok(cours);
    }

    @PostMapping
    public ResponseEntity<Cours> saveClaim(@RequestBody Cours claim) {
        Cours savedClaim = coursService.addCours(claim);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedClaim);
    }
    @DeleteMapping("/{claimId}")
    public ResponseEntity<Void> deleteClaim(@PathVariable Long claimId) {
        coursService.deleteCours(claimId);
        return ResponseEntity.noContent().build();
    }
}
