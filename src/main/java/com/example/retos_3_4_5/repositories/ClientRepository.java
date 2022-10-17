package com.example.retos_3_4_5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.retos_3_4_5.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
