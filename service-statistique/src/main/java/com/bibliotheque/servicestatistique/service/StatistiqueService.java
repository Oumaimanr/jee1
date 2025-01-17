package com.bibliotheque.servicestatistique.service;




import com.bibliotheque.servicestatistique.model.Statistique;
import com.bibliotheque.servicestatistique.repository.StatistiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatistiqueService {

    @Autowired
    private StatistiqueRepository statsRepository;

    public List<Statistique> getAllBookStats() {
        return statsRepository.findAll();
    }

    public Statistique saveBookStats(Statistique stats) {
        return statsRepository.save(stats);
    }
}
