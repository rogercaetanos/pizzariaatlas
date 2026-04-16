package com.itb.inf3an.pizzariaatlas.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ItemPedido")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @Column(nullable = false)
    private int quantidadeItem;
    @Column(nullable = false)
    private double valorUnitario;
    private boolean codStatus;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "pedido_id", referencedColumnName = "id", nullable = true)
    private Pedido pedido;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_id", referencedColumnName = "id", nullable = true)
    private Produto produto;

}
