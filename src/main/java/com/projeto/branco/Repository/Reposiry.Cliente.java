packagem com.projeto.branco.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.branco.model.Cliente;

public interface ReposiryCliente extends JpaRepository<Cliente, Long> {
    
}