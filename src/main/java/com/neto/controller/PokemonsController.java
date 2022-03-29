package com.neto.controller;

import java.util.List;

import com.neto.model.Pokemon;
import com.neto.respository.PokemonRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/pokemons")
@AllArgsConstructor
public class PokemonsController {

  private final PokemonRepository pokemonRepository;

  @GetMapping
  public List<Pokemon> list() {
    return pokemonRepository.findAll();
  }

  
}
