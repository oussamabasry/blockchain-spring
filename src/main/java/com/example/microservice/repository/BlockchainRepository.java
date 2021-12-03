package com.example.microservice.repository;

import com.example.microservice.entities.Blockchain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlockchainRepository extends JpaRepository<Blockchain, String> {
}
