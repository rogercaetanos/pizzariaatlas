package com.itb.inf3an.pizzariaatlas.model.entity;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("CLIENTE")
@EqualsAndHashCode(callSuper=true)
@Setter
@Getter
public class Cliente extends Usuario {


    private int numeroPontos;


}
