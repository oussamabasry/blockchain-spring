package com.example.microservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Transaction {
    @Id
    private String id;
    private Date date;
    private String sourceAddress;
    private String destinationAddress;
    private BigDecimal amount;
    @ManyToOne
    private Block block;
}
