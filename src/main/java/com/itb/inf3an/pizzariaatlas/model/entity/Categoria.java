package com.itb.inf3an.pizzariaatlas.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Categoria")
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @Column(nullable = false, length = 45)
    private String nome;
    @Column(nullable = true, length = 255)
    private String descricao;
    private boolean codStatus;

}
