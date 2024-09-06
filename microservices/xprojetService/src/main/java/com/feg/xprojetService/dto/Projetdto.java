package com.feg.xprojetService.dto;

import com.feg.xprojetService.entity.Projet;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data @Builder

public class Projetdto {
    private Long id;
    private String name;
    private Date date_debut;
    private Date date_fin;
    private Double budget;
    public  static Projetdto toDto(Projet p){
        return Projetdto.builder()
                .id(p.getId())
                .name(p.getName())
                .date_debut(p.getDate_debut())
                .date_fin(p.getDate_fin())
                .budget(p.getBudget())
                .build();
    }
}
