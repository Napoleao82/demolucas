package com.demo.demolucas.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class ClienteDto {
    @Id
    @GeneratedValue
    private Long id;
    private String Nome;
    private int idade;
    private String email;
}
