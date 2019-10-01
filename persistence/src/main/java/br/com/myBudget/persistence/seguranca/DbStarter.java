package br.com.myBudget.persistence.seguranca;

import br.com.myBudget.model.seguranca.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbStarter implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {
        Usuario u = new Usuario();
        u.setNome("Marcio");
        u.setEmail("marcio@email.com");
        u.setSenha("123");

        usuarioRepository.save(u);
    }
}
