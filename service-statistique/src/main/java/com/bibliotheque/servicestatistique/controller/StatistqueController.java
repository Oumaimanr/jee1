package com.bibliotheque.servicestatistique.controller;




import com.bibliotheque.servicestatistique.model.Statistique;
import com.bibliotheque.servicestatistique.service.StatistiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/statistics")
@CrossOrigin(origins = "http://localhost:4200")
public class StatistqueController {

    @Autowired
    private StatistiqueService statisticsService;

    @GetMapping
    public List<Statistique> getAllBookStats() {
        return statisticsService.getAllBookStats();
    }

    @PostMapping
    public Statistique saveBookStats(@RequestBody Statistique stats) {
        return statisticsService.saveBookStats(stats);
    }
}
