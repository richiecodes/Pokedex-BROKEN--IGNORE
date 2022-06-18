package com.richiecodes.pokedex.repositories;

import com.richiecodes.pokedex.model.Pokemon;
import org.springframework.data.repository.CrudRepository;

public interface PokemonRepository extends CrudRepository<Pokemon, Integer> {
}
