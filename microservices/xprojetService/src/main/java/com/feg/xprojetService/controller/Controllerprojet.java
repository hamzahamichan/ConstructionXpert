package com.feg.xprojetService.controller;

import com.feg.xprojetService.client.Tachecli;
import com.feg.xprojetService.entity.Allprojets;
import com.feg.xprojetService.entity.Projet;
import com.feg.xprojetService.services.Iprojetser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/p/projet")
public class Controllerprojet {
    @Autowired
    Iprojetser iprojetser;
    @Autowired
    private Tachecli tachecli;

    @PostMapping(value = "/ajouter/projet", consumes = "application/json")
    public Projet addProjet(@RequestBody Projet projet){
        return this.iprojetser.addProjet(projet);
    }
    @GetMapping("/getAll")
    public List<Projet> getAllprojet(){
        return this.iprojetser.getAllprojet();
    }

    @GetMapping("{id}")
    public Allprojets projetWithTaches(@PathVariable Long id){

        return iprojetser.getAllprojetTache(id);
    }

}
