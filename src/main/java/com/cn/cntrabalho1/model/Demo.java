package com.cn.cntrabalho1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Demo {

    @Id
    private UUID id;

    private String test;
}
