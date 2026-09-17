package com.projeto.banco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name="tb_notificacao")
@Getter
@Setter
@NoArgsConstructor

public class Notificacao {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@column

@column

@column

@column

@column
    
}
