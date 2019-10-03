package br.com.myBudget.service.movimento;

import java.util.Optional;

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

	@Override
	public Despesa findById(Long id) {
		Optional<Despesa> d = despesaRepository.findById(id);
		return d.isPresent()?d.get():null;
	}



}
