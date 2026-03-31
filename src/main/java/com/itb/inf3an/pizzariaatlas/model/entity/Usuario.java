package com.itb.inf3an.pizzariaatlas.model.entity;


import com.itb.inf3an.pizzariaatlas.model.enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING)
@Setter   // Atribui informação ao objeto
@Getter   // Recupera informação do objeto
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identificado automaticamente acrescentando 1 ao registro anterior
    @EqualsAndHashCode.Include
    private Long id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 15, nullable = true)
    private String cpf;
    @Column(nullable = true)
    private LocalDate dataNascimento;
    @Column(length = 45, nullable = false)
    private String email;
    @Column(length = 255, nullable = false)
    private String password;
    @Column(length = 20, nullable = true)
    private String sexo;
    @Column(length = 45, nullable = true)
    private String logradouro;
    @Column(length = 12, nullable = true)
    private String cep;
    @Column(length = 45, nullable = true)
    private String bairro;
    @Column(length = 45, nullable = true)
    private String cidade;
    @Column(length = 2, nullable = true)
    private String uf;
    private boolean codStatus;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, name = "tipo_usuario", insertable = false, updatable = false)
    private TipoUsuario tipoUsuario;

}
