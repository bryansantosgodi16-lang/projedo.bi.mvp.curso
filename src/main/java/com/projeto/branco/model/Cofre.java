package com.projeto.banco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="tb_Cofre")
@Getter
@Setter
@NoArgsConstructor

public class Cofre {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
   
@Column(nullable = false)
private float mostar_saldo;

@Column(nullable = false)
private String guardar_dinheroCofre;

@Column(nullable = false)
private String remover_dinheiroCofre;

@Column(nullable = false)
private String 
@Column()

@Column()

@Column()

@Column() 

}
