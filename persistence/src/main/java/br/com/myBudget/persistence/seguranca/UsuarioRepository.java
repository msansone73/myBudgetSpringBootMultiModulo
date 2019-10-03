package br.com.myBudget.persistence.seguranca;

import br.com.myBudget.model.seguranca.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

	Usuario findByEmailAndSenha(String email, String senha);
}
