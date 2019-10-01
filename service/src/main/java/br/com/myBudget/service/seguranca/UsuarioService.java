package br.com.myBudget.service.seguranca;

import br.com.myBudget.model.seguranca.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario inserir(Usuario usuario);
    Usuario lerById(Long idUsuario);

    List<Usuario> lerTodos();
}
