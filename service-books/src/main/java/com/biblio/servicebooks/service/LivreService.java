package com.biblio.servicebooks.service;

import com.biblio.servicebooks.model.LivreEntite; // Importez l'entité correcte
import com.biblio.servicebooks.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreService {

    @Autowired
    private LivreRepository livreRepository;

    public List<LivreEntite> getAllBooks() {  // Utilisez LivreEntite au lieu de Book
        return livreRepository.findAll();
    }

    public LivreEntite saveBook(LivreEntite livreEntite) {  // Utilisez LivreEntite ici aussi
        return livreRepository.save(livreEntite);
    }

    public void deleteBook(Long id) {
        livreRepository.deleteById(id);
    }

    public List<LivreEntite> getBooksByCategory(String category) {
        return livreRepository.findByCategory(category);
    }
}
