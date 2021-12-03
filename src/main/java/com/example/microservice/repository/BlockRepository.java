package com.example.microservice.repository;

import com.example.microservice.entities.Block;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlockRepository extends JpaRepository<Block, String> {
}
