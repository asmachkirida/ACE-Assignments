package com.example.rest;

import com.example.rest.entities.Client;
import com.example.rest.entities.Compte;
import com.example.rest.entities.TypeCompte;
import com.example.rest.repositories.ClientRepository;
import com.example.rest.repositories.CompteRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository, ClientRepository clientRepository, RepositoryRestConfiguration restConfiguration) {
		return args -> {
			restConfiguration.exposeIdsFor(Compte.class);

			Client c1 = clientRepository.save(new Client(null, "Amal", null, new ArrayList<>()));
			Client c2 = clientRepository.save(new Client(null, "Ali", null, new ArrayList<>()));

			compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.EPARGNE, c1));
			compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.COURANT, c1));
			compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.EPARGNE, c2));

			compteRepository.findAll().forEach(c -> System.out.println(c.toString()));
		};
	}

	}



