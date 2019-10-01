package br.com.myBudget.rest.seguranca;

import br.com.myBudget.model.seguranca.Usuario;
import br.com.myBudget.service.seguranca.UsuarioService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seguranca/")
public class UsuarioController {

    UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService=usuarioService;
    }

    @GetMapping("usuario/{id}")
    public ResponseEntity getUsuarioById(@PathVariable Long id) {
        Usuario u = usuarioService.lerById(id);
        return new ResponseEntity<Usuario>(u, HttpStatus.OK);

    }

    @GetMapping("usuario/")
    public List<Usuario> getUsuario(){
        return usuarioService.lerTodos();
    }

    @PostMapping("usuario/")
    public Usuario inserirUsuario(Usuario usuario){
        return usuarioService.inserir(usuario);
    }


}
