package com.example.microservice.service;

import com.example.microservice.entities.Block;
import com.example.microservice.entities.Transaction;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public interface BlockService {
    Block createBlock(Integer nonce, String previousHash, List<Transaction> transactions);
    String calculateHash(Block block) throws NoSuchAlgorithmException;
    String miningBlock(Block block, Integer difficulty);
}
