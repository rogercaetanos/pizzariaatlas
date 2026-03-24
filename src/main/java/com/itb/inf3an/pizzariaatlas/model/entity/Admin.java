package com.itb.inf3an.pizzariaatlas.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("ADMIN")
@EqualsAndHashCode(callSuper=true)
@Setter
@Getter
public class Admin extends Usuario {

    @Column(length = 10, nullable = true)
    private String nivelAcesso;
}
