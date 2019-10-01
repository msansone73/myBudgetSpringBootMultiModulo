package br.com.myBudget.model.movimento;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Receita {

	@Id
	@GeneratedValue(generator = "Despesa_generator")
	@SequenceGenerator(name = "Despesa_generator",
	sequenceName = "Despesa_generator",
	initialValue = 1000)
	private Long id;
	private String nome;
	private String descricao;
	private LocalDate data;
	private Float valor;
	public Receita() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	
	
	
	
}
