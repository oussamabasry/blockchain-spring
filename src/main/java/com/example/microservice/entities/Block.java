package com.example.microservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Block {
    @Id
    private String id;
    private Date creationDate;
    private String blockHash;
    private String previousHashBlock;
    private Integer nonce;
    @OneToMany(mappedBy = "block")
    private Collection<Transaction> transactions;
    @ManyToOne
    private Blockchain blockchain;
}
