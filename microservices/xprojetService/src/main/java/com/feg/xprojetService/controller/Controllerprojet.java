package com.feg.xprojetService.controller;

import com.feg.xprojetService.entity.Allprojets;
import com.feg.xprojetService.entity.Projet;
import com.feg.xprojetService.repository.Projetrepository;
import com.feg.xprojetService.services.ProjetImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/p")
public class Controllerprojet {
    @Autowired
    ProjetImpl projetimp;

    @PostMapping(value = "/ajouter/projet", consumes = "application/json")
    public Projet addProjet(@RequestBody Projet projet){
        return this.projetimp.addProjet(projet);
    }
    @GetMapping("/getAll")
    public List<Projet> getAllprojet(){
        return this.projetimp.getAllprojet();
    }

    @GetMapping("/getAllTaches/{id}")
    public Allprojets getAllprojetTaches(@PathVariable Long projetId){
        return projetimp.getAllprojetTache(projetId);
    }

}
