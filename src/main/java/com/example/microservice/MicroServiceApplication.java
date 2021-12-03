package com.example.microservice;

import com.example.microservice.entities.Block;
import com.example.microservice.entities.Transaction;
import com.example.microservice.service.BlockService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class MicroServiceApplication implements CommandLineRunner {

    private BlockService blockService;

    public MicroServiceApplication(BlockService blockService) {
        this.blockService = blockService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Transaction> transactions = new ArrayList<>();
        for (int i = 0; i < 6 ; i++) {
            Transaction transaction =  new Transaction();
            transaction.setAmount(BigDecimal.valueOf(4000+20*i));
            transaction.setDate(new Date());
            transaction.setDestinationAddress("gfkdhfkhfhhvui"+500*i);
            transaction.setSourceAddress("dfcfjeruicfruifhruifhudfui"+500*i);
            transactions.add(transaction);
        }
        blockService.createBlock(1,null,transactions);
    }
}
