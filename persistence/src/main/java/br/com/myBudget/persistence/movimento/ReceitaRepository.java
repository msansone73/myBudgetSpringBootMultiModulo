package br.com.myBudget.persistence.movimento;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.myBudget.model.movimento.Receita;

public interface ReceitaRepository extends JpaRepository<Receita, Long>{

}
