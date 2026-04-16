package com.itb.inf3an.pizzariaatlas.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Produto") // facultativo quando o nome da classe é o mesmo da tabela
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Produto {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT (Melhor opção para o SQL-SERVER)
    @EqualsAndHashCode.Include
    private Long id;
    @Column(nullable = false, length = 45)  // false: NOT NULL
    private String nome;
    @Column(nullable = true, length = 255)
    private String descricao;
    @Column(nullable = true, columnDefinition = "DECIMAL(5,2)")
    private double valorVenda;
    @Column(nullable = true, columnDefinition = "DECIMAL(5,2)")
    private double valorCompra;
    @Column(nullable = true, length = 20)
    private String tipo;
    @JsonIgnore
    private int quantidadeEstoque;
    private boolean codStatus;
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id", referencedColumnName = "id", nullable = true)
    private Categoria categoria;

}


// Relacionametos
// @ManyToOne : Muitos p/ um
// CascadeType: Define como as operações de persistência (INSERT, UPDATE, DELETE) serão
//              propagadas para uma entidade filha no banco de dados.
// MERGE: Propapaga operações de atualização da entidade pai para as filhas
//        O MERGE é usado para atuallizar uma entidade desaclopada no banco de dados,
//        Se a entidade não existe no banco, o MERGE a insere,
//        Se já existe, o MERGE atualiza os dados com os novos valores
// Além do MERGE, temos: ALL, PERSIST, REMOVE, REFRESH E DETACH
// fetch: Define como os dados relacionados serão carregados do banco de dados quando
//        a entidade for consultada
// FetchType.LAZY: Os dados só serão carregados quando forem acessados explicitamente no código
// FetchType.EAGER: Join automático, os dados relacionados serão carregados quando a entidade for
//                  consultada
