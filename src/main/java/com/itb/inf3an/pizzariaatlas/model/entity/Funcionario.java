package com.itb.inf3an.pizzariaatlas.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("FUNCIONARIO")
@EqualsAndHashCode(callSuper=true)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario extends Usuario {

    @Column(length = 15, nullable = true)
    private String cnh;

}
