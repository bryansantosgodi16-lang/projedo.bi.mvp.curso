package com.projeto.banco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="tb_conta")
@Getter
@Setter
@NoArgsConstructor

public class conta extends cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false)
private Long id_Cliente;

@Column(nullable = false)
private float mostar_saldo;

@column(nullable = false)
 private ocultar_saldo;

@column(nullable = false)
private String historico_DeTransferencia;

@column(nullable = false)
private String valor_saque;

@column(nullable = false)
private String valor_deposito;


}
