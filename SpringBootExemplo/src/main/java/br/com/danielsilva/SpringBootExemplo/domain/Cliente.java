package br.com.danielsilva.SpringBootExemplo.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TB_Cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Cliente {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente_seq")
    @SequenceGenerator(name="cliente_seq", sequenceName="sq_cliente", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NOME", nullable = false, length = 50)
    private String nome;

    @Column(name = "Codigo", nullable = false, length = 50)
    private String codigo;
}
