package br.com.myBudget.model.seguranca;

import javax.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(generator = "Usuario_generator")
    @SequenceGenerator(
            name = "Usuario_generator",
            sequenceName = "Usuario_sequence",
            initialValue = 1000
    )
    private Long id;
    private String email;
    private String nome;
    private String senha;
	public Usuario() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
