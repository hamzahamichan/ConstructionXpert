package com.feg.tacheServices.repository;

import com.feg.tacheServices.entity.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Tacherepository extends JpaRepository<Tache,Long> {
   List<Tache> findAllByProjetId(Long projetId);
}
