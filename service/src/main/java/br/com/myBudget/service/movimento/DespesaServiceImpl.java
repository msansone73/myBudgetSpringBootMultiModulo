package br.com.myBudget.service.movimento;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.myBudget.model.movimento.Despesa;
import br.com.myBudget.persistence.movimento.DespesaRepository;

@Service
public class DespesaServiceImpl implements DespesaService {

	@Autowired
	DespesaRepository despesaRepository;
	
	@Override
	public java.util.List<Despesa> findAll() {
		return despesaRepository.findAll();
	}

	@Override
	public Despesa inserir(Despesa despesa) {
		return despesaRepository.save(despesa);
	}



}
