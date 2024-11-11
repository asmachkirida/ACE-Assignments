package com.example.rest.repositories;

import com.example.rest.entities.Client;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    // You can define custom query methods here if needed
    @EntityGraph(attributePaths = {"comptes"})
    List<Client> findAll();  // This will load `comptes` with each client.
}
