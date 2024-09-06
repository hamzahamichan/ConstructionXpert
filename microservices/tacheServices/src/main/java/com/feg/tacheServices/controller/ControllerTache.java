package com.feg.tacheServices.controller;

import com.feg.tacheServices.entity.Tache;
import com.feg.tacheServices.service.ITacheser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/taches")
public class ControllerTache {
    @Autowired
    private ITacheser iTacheser;

    @PostMapping("/ajouter")
    public Tache createTache(@RequestBody Tache tache) {
        return this.iTacheser.createTache(tache);
    }

    @GetMapping("/mestaches")
    public List<Tache> recupérerTaches() {
        return this.iTacheser.recupererTaches();
    }

    @PutMapping("/editer/{id}")
    public Tache editTache(@PathVariable Long id, @RequestBody Tache tache) {
        return this.iTacheser.editTache(id, tache);
    }

    @GetMapping("/projet/{id}")
    public List<Tache> recupérerTachesProjet(@PathVariable Long id) {
        return this.iTacheser.recupererTachesProjet(id);
    }
}
