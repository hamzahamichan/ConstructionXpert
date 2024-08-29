package com.feg.tacheServices.entity;

import com.feg.tacheServices.enums.Statut;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor @ToString
@Data @Entity @Builder
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tache;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private Statut statut;
    private Long projetId;
}
