package com.example.microservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Blockchain {
    @Id
    private String id;
    private String name;
    private Integer difficulty;
    private BigDecimal miningReward;
    @OneToMany
    private List<Block> blockList;
}
