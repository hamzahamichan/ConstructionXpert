package com.feg.xprojetService.entity;

import lombok.*;

import java.util.Date;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Allprojets {
    private String name;
    private Date date_debut;
    private Date date_fin;
    private Double budget;
    List<Tache> taches;
}
