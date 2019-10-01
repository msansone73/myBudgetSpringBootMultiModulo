package br.com.myBudget.service.movimento;



import java.util.List;

import br.com.myBudget.model.movimento.Despesa;

public interface DespesaService {

	List<Despesa> findAll();

	Despesa inserir(Despesa despesa);


}
