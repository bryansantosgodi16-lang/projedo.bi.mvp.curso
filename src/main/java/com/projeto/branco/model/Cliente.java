<<<<<<< HEAD
import com.projeto.banco.model.Getters;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity(name="tb_clientes")
@Getters
@NoArgsConstructor

class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable=false)
private String nome;

@Column(nullable=false, unique=true)
private String email;

@Column(nullable=false)
private String senha;

@Column(nullable=false, unique=true)
private String cpf;

@Column(nullable=false, unique=true)
private String telefone;


=======

@Entity(name= "tb_cliente")
@Getters
@NoArgsConstructos
class cliente {
@id
@generatedvalue(strategy = generationtype.IDENTITY)
private long id;

@column(nullable = false)
private String nome;

@column(nullable = false, unique = true)
private String documento;

@column(nullable = false, unique = true)
private String email;

@column(nullable = false)
private String senha;

@column(nullable = false)
private String cpf;

@column(nullable = false)
private String cep;
>>>>>>> 6f53452a93455fbaa6fb747b45cb708a82b711cd
}