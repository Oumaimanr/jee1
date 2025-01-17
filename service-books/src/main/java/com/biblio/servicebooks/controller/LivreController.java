package com.biblio.servicebooks.controller;

import com.biblio.servicebooks.model.LivreEntite; // Importez l'entité correcte
import com.biblio.servicebooks.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:4200")
public class LivreController {

    @Autowired
    private LivreService livreService;  // Renommé pour être plus cohérent

    @GetMapping
    public List<LivreEntite> getAllBooks() {  // Utilisez LivreEntite ici aussi
        return livreService.getAllBooks();
    }

    @PostMapping
    public ResponseEntity<LivreEntite> createBook(@RequestBody LivreEntite livreEntite) {  // Utilisez LivreEntite ici
        return ResponseEntity.ok(livreService.saveBook(livreEntite));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        livreService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
}
