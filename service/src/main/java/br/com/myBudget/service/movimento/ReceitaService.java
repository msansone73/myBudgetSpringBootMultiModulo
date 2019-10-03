package br.com.myBudget.service.movimento;

import java.util.List;

import br.com.myBudget.model.movimento.Receita;

public interface ReceitaService {

	List<Receita> findAll();
	
	Receita inserir(Receita receita);
	
	Receita findById(Long id);
}
