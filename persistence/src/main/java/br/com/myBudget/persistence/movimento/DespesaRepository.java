package br.com.myBudget.persistence.movimento;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.myBudget.model.movimento.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Long> {

}
