package com.itb.inf3an.pizzariaatlas.model.entity;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("CLIENTE")
@EqualsAndHashCode(callSuper=true)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente extends Usuario {


    private int numeroPontos;


}
