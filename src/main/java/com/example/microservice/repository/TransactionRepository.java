package com.example.microservice.repository;

import com.example.microservice.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
