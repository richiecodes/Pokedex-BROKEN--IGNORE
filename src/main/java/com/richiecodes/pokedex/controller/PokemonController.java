package com.richiecodes.pokedex.controller;

import com.richiecodes.pokedex.exception.ResourceNotFoundException;
import com.richiecodes.pokedex.model.Pokemon;
import com.richiecodes.pokedex.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonRepository repository;

    @GetMapping
    public List<Pokemon> getAllPokemon() {
        return repository.findAll();
    }

    @GetMapping("search/id/{num}")
    public ResponseEntity<Pokemon> getPokemonByNum(@PathVariable("num") int num) {
        Pokemon p = repository.findById(num).orElseThrow(() -> new ResourceNotFoundException("Cannot find pokemon!"));

        return ResponseEntity.ok(p);
    }

    @GetMapping("search/name/{name}")
    public ResponseEntity<Pokemon> getPokemonByName(@PathVariable String name) {
        Pokemon p = repository.findByName(name).orElseThrow(() -> new ResourceNotFoundException("Cannot find pokemon!"));


        return ResponseEntity.ok(p);
    }
}
