package tn.esprit.koussaykouki4infini232.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.koussaykouki4infini232.entities.Inscription;
import tn.esprit.koussaykouki4infini232.entities.Moniteur;
import tn.esprit.koussaykouki4infini232.entities.Support;
import tn.esprit.koussaykouki4infini232.services.MoniteurServicesImpl;

@RestController
@RequestMapping("/api/moniteur")
public class MoniteurController {
    @Autowired
    private MoniteurServicesImpl moniteurServices ;

    @PostMapping("/save/{numSkier}")
    public Moniteur addAndAssignToSkier(@RequestBody Moniteur moniteur , @PathVariable Long numSkier)
    {
        return moniteurServices.addInstructorAndAssignToCourse(moniteur , numSkier);
    }
    @PostMapping("/saves/{support}")
    public Moniteur addAndAssignToSkiers(@RequestBody Moniteur moniteur , @PathVariable Support support)
    {
        return moniteurServices.addInstructorAndAssignToCourse(moniteur , support);
    }

}
