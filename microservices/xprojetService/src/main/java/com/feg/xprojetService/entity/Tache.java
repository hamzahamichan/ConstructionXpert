package com.feg.xprojetService.entity;

import com.feg.xprojetService.enums.Statut;
import lombok.*;

import java.util.Date;

@Builder @AllArgsConstructor @NoArgsConstructor
@Data @Getter @Setter
public class Tache {
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private Statut statut;
}
