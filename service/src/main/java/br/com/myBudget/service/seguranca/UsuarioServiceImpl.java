package br.com.myBudget.service.seguranca;

import br.com.myBudget.model.seguranca.Usuario;
import br.com.myBudget.persistence.seguranca.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements  UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository=usuarioRepository;
    }

    @Override
    public Usuario inserir(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario lerById(Long idUsuario) {
        return usuarioRepository.findById(idUsuario).get();
    }

    @Override
    public List<Usuario> lerTodos() {
        return usuarioRepository.findAll();
    }
}
