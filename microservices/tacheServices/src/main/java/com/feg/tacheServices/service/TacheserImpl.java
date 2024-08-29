package com.feg.tacheServices.service;

import com.feg.tacheServices.entity.Tache;
import com.feg.tacheServices.enums.Statut;
import com.feg.tacheServices.repository.Tacherepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacheserImpl implements ITacheser {
    @Autowired
    private Tacherepository tacherepository;

    @Override
    public Tache createTache(Tache tache) {
        tache.setStatut(Statut.vers);  // Mettre un statut par défaut
        return this.tacherepository.save(tache);
    }

    @Override
    public List<Tache> recupererTaches() {
        return this.tacherepository.findAll();
    }

    @Override
    public Tache editTache(Long id, Tache tache) {
        Tache tacheExistante = this.tacherepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tâche non trouvée"));

        tacheExistante.setStatut(tache.getStatut());
        tacheExistante.setDateDebut(tache.getDateDebut());
        tacheExistante.setDateFin(tache.getDateFin());
        tacheExistante.setDescription(tache.getDescription());

        return this.tacherepository.save(tacheExistante);
    }

    @Override
    public List<Tache> recupererTachesProjet(Long id) {
        return this.tacherepository.findAllByProjetId(id);
    }
}
