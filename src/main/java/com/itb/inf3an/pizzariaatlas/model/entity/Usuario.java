package com.itb.inf3an.pizzariaatlas.model.entity;


import com.itb.inf3an.pizzariaatlas.model.enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_usuario", insertable = false, updatable = false)
    private TipoUsuario tipoUsuario;




}
