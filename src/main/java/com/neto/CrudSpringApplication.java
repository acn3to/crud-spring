package com.neto;

import com.neto.model.Pokemon;
import com.neto.respository.PokemonRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabase(PokemonRepository pokemonRepository) {
		return args -> {
			pokemonRepository.deleteAll();

			Pokemon b = new Pokemon();
			b.setName("Bulbasaur");

			pokemonRepository.save(b);

		};
	}
}
