package com.itb.inf3an.pizzariaatlas.model.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("FUNCIONARIO")
public class Funcionario extends Usuario {

    private String cnh;

}
