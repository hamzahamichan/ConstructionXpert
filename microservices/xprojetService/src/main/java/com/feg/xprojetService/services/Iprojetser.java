package com.feg.xprojetService.services;

import com.feg.xprojetService.entity.Allprojets;
import com.feg.xprojetService.entity.Projet;

import java.util.List;

public interface Iprojetser {
     Projet addProjet(Projet projet);
     List<Projet> getAllprojet();
     Allprojets getAllprojetTache(Long projetId);

}
