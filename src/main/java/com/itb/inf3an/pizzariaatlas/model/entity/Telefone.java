package com.itb.inf3an.pizzariaatlas.model.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Telefone")
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @Column(nullable = false, length = 12)
    private String numero;
    @Column(nullable = false, length = 3)
    private String ddd;
    @Column(nullable = false, length = 15)
    private String tipo;
    private boolean codStatus;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id", nullable = true)
    private Usuario usuario;
}
