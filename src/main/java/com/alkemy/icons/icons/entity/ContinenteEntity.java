package com.alkemy.icons.icons.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "continentes")
public class ContinenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    private String imagen;
    private String denominacion;
}
