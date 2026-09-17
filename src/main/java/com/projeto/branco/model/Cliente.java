
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
}