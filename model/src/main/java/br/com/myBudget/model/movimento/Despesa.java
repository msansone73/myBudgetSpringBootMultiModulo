package br.com.myBudget.model.movimento;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Despesa {
	
	@Id
	@GeneratedValue(generator = "Despesa_generator")
	@SequenceGenerator(
			name="Despesa_generator",
			sequenceName = "Despesa_generator",
			initialValue = 1000)
	private Long id;
	private String nome;
	private LocalDateTime data;
	private String local;
	private String descricao;
	private Float valor;
	
	public Despesa() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return nome;
	}
	public void setName(String name) {
		this.nome = name;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	
	
	

}
