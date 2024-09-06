package com.feg.xprojetService.services;

import com.feg.xprojetService.client.Tachecli;
import com.feg.xprojetService.entity.Allprojets;
import com.feg.xprojetService.entity.Projet;
import com.feg.xprojetService.entity.Tache;
import com.feg.xprojetService.repository.Projetrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProjetImpl implements Iprojetser {

    @Autowired
    Projetrepository projetrepository;

    @Autowired
   Tachecli client;

    @Override
    public Projet addProjet(Projet projet) {
        return projetrepository.save(projet);
    }

    @Override
    public List<Projet> getAllprojet() {
        return projetrepository.findAll();
    }

    @Override
    public Allprojets getAllprojetTache(Long id) {
        Projet projet = projetrepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Projet non trouvé"));

        List<Tache> taches = client.findAllTachesByProjet(id);

        return Allprojets.builder()
                .name(projet.getName())
                .budget(projet.getBudget())
                .taches(taches)
                .build();
    }
}


