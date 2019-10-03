package br.com.myBudget.rest.movimento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.myBudget.model.movimento.Despesa;
import br.com.myBudget.service.movimento.DespesaService;

@RestController
@RequestMapping("/movimento/")
public class DespesaController {

	@Autowired
	DespesaService despesaService; 

	@GetMapping("/despesa/{id}")
	public Despesa findByDespesa(Long id) {
		return despesaService.findById(id);
	}
	
	@GetMapping("/despesa/")
	public List<Despesa> findAll(){
		return despesaService.findAll(); 
	}
	
	@PostMapping("/despesa/")
	public Despesa inserir(@RequestBody Despesa despesa) {
		return despesaService.inserir(despesa);
	}

}
