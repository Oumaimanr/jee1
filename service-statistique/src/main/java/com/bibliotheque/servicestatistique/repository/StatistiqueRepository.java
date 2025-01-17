package com.bibliotheque.servicestatistique.repository;


import com.bibliotheque.servicestatistique.model.Statistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatistiqueRepository extends JpaRepository<Statistique, Long> {
}
