package com.itb.inf3an.pizzariaatlas.model.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identificado automaticamente acrescentando 1 ao registro anterior
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String password;
    private String sexo;
    private String logradouro;
    private String cep;
    private String bairro;
    private String cidade;
    private String uf;
    private boolean codStatus;
    private String tipoUsuario;


}
