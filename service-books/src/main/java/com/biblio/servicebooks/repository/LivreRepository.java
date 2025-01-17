package com.biblio.servicebooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.biblio.servicebooks.model.LivreEntite; // Importez l'entité correcte

import java.util.List;

@Repository
public interface LivreRepository extends JpaRepository<LivreEntite, Long> {  // Utilisez LivreEntite au lieu de Book
    List<LivreEntite> findByCategory(String category);  // Remplacez également Book par LivreEntite
}
