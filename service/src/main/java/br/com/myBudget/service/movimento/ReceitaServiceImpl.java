package br.com.myBudget.service.movimento;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.myBudget.model.movimento.Receita;
import br.com.myBudget.persistence.movimento.ReceitaRepository;

@Service
public class ReceitaServiceImpl implements ReceitaService {

	private ReceitaRepository receitaRepository;
	
	public ReceitaServiceImpl(ReceitaRepository receitaRepository) {
		super();
		this.receitaRepository = receitaRepository;
	}

	@Override
	public List<Receita> findAll() {
		return this.receitaRepository.findAll();
	}

	@Override
	public Receita inserir(Receita receita) {
		return this.receitaRepository.save(receita);
	}

	@Override
	public Receita findById(Long id) {
		Optional<Receita> r = this.receitaRepository.findById(id);
		return r.isPresent()?r.get():null;
	}

}
