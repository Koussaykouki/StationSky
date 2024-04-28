package tn.esprit.koussaykouki4infini232.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.koussaykouki4infini232.entities.Abonnement;
import tn.esprit.koussaykouki4infini232.services.IAbonnementServices;

import java.util.List;

@RestController
@RequestMapping("/api/claims")
public class AbonnementController {

    @Autowired
    private IAbonnementServices abonnementServices;

 /*   @GetMapping("/{claimId}")
    public ResponseEntity<Claim> getClaimById(@PathVariable Long claimId) {
        Claim claim = abonnementServices.getClaimById(claimId);
        return ResponseEntity.ok(claim);
    }

    @GetMapping
    public ResponseEntity<List<Claim>> getAllClaims() {
        List<Claim> claims = abonnementServices.getAllClaims();
        return ResponseEntity.ok(claims);
    }

    @PostMapping
    public ResponseEntity<Claim> saveClaim(@RequestBody Claim claim) {
        Claim savedClaim = abonnementServices.saveClaim(claim);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedClaim);
    }
    @PutMapping("/{claimId}")
    public ResponseEntity<Claim> updateClaim(@PathVariable Long claimId, @RequestBody Claim updatedClaim) {
        Abonnement updatedClaimData = abonnementServices.(claimId, updatedClaim);

        if (updatedClaimData != null) {
            return ResponseEntity.ok(updatedClaimData);
        } else {
            // Handle claim not found
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{claimId}")
    public ResponseEntity<Void> deleteClaim(@PathVariable Long claimId) {
        abonnementServices.(claimId);
        return ResponseEntity.noContent().build();
    }*/
}
