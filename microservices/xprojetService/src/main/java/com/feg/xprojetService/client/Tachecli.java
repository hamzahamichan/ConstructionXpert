package com.feg.xprojetService.client;

import com.feg.xprojetService.entity.Tache;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name ="tache-service",url ="${application.config.taches-url}")
public interface Tachecli {

    @GetMapping("/projet/{id}")
    List<Tache> recupérerTachesProjet(@PathVariable Long projetId);
}
