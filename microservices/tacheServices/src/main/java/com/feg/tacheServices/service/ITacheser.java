package com.feg.tacheServices.service;

import com.feg.tacheServices.entity.Tache;

import java.util.List;

public interface ITacheser {
    Tache createTache(Tache tache);
    List<Tache> recupererTaches();
    Tache editTache(Long id, Tache tache);
    List<Tache> recupererTachesProjet(Long id);
}
