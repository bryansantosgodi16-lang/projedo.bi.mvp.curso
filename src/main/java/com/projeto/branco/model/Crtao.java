package com.projeto.banco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="tb_Crtao")
@Getter
@Setter
@NoArgsConstructor

public class Crtao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false , unique = ture)
private String titular; 

@Column(nullable = false , unique = false)
private String cpf;

@Column (nullable = false)
private String tipo_cartao

@Column (nullable = false)
private String bandeira;

@Column (nullable = false)
private float renda_informada;

@Column (nullable = false)
private String endereco_entrega;

@Column (nullable = false)
private float limite;

@Column (nullable = false)
private float numero_cartao;

@Column (nullable = false)
private Data data_validade;

@Column (nullable = false)
private int cvv;

@Column (nullable = false)
private String agencia;

@Column (nullable = false)
private String conta;

@Column (nullable = false, unique = ture ) 
private String codigo;

@Column (nullable = false)
private String 

@Column (nullable = false)
private Data data_solicitada;

@Column (nullable = false)
private String status_pedidos;

@Column (nullable = false)
private int codigo_rasteio; 


}