package com.example.microservice.service;

import com.example.microservice.entities.Block;
import com.example.microservice.entities.Transaction;
import com.example.microservice.repository.BlockRepository;
import com.google.common.hash.Hashing;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Service
public class BlockServiceImpl implements BlockService {
    private BlockRepository blockRepository;

    public BlockServiceImpl(BlockRepository blockRepository) {
        this.blockRepository = blockRepository;
    }

    @Override
    public Block createBlock(Integer nonce, String previousHash, List<Transaction> transactions) {
        Block block = new Block();
        block.setTransactions(transactions);
        block.setNonce(nonce);
        block.setPreviousHashBlock(previousHash);
        block.setCreationDate(new Date());
        block.setId(UUID.randomUUID().toString());
        String hash = calculateHash(block);
        block.setBlockHash(hash);
        return blockRepository.save(block);
    }

    @Override
    public String calculateHash(Block block){
        String blockString = block.getPreviousHashBlock()+block.getNonce()+block.getTransactions().hashCode();
        String sha256hex = Hashing.sha256()
                .hashString(blockString, StandardCharsets.UTF_8)
                .toString();
        return sha256hex;
    }



    @Override
    public String miningBlock(Block block, Integer difficulty) {
        while (true){

        }
    }
}
