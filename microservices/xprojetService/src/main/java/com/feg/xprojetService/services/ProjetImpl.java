package com.feg.xprojetService.services;

import com.feg.xprojetService.client.Tachecli;
import com.feg.xprojetService.entity.Allprojets;
import com.feg.xprojetService.entity.Projet;
import com.feg.xprojetService.repository.Projetrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProjetImpl implements Iprojetser{


    @Autowired
    private Projetrepository projetrepository;
      @Autowired
      private Tachecli  client;

    @Override
    public Projet addProjet(Projet projet) {
        return this.projetrepository.save(projet);
    }

    @Override
    public List<Projet> getAllprojet() {
        return projetrepository.findAll();
    }
    @Override
    public Allprojets getAllprojetTache(Long projetId) {
        var projet = projetrepository.findById(projetId).orElse(Projet.builder()
                .name("pas de projet")
                .build()
        );

        var taches = client.recupérerTachesProjet(projetId);

        // Create a single Allprojets object
        Allprojets allprojet = Allprojets.builder()
                .name(projet.getName())
                .budget(projet.getBudget())
                .taches(taches)
                .build();

        // Return the single object
        return allprojet;
    }


}
