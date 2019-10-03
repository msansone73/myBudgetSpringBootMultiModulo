package br.com.myBudget.rest.movimento;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.myBudget.model.movimento.Receita;
import br.com.myBudget.service.movimento.ReceitaService;

@RestController
@RequestMapping("/receita")
public class ReceitaController {

	private ReceitaService receitaService;

	public ReceitaController(ReceitaService receitaService) {
		this.receitaService = receitaService;
	}

	@GetMapping("/receita/{id}")
	public Receita findById(Long id) {
		return this.receitaService.findById(id);
	}
	
	@GetMapping("/receita/")
	public List<Receita> findAll(){
		return this.receitaService.findAll();
	}
	
	@PostMapping("/receita/")
	public Receita inserir(@RequestBody Receita receita) {
		return this.receitaService.inserir(receita);
	}
	
	
	
}
