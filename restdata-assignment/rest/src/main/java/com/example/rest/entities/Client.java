package com.example.rest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String email;
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + nom + '\'' +
                // Avoid calling comptes.toString() to prevent circular reference
                '}';
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client")
    private List<Compte> comptes;
}
