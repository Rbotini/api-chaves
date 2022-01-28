package com.botidevapichaves.models;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "tb_personagens")

public class Personagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private String  apelido;
	private String genero;
	private int idade;
	private String pais;
	private String oficio;
	
	
	public Personagem() {
		
	}


	public Personagem(long id, String nome, String apelido, String genero, int idade, String pais, String oficio) {
		super();
		this.id = id;
		this.nome = nome;
		this.apelido = apelido;
		this.genero = genero;
		this.idade = idade;
		this.pais = pais;
		this.oficio = oficio;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getApelido() {
		return apelido;
	}


	public void setApelido(String apelido) {
		this.apelido = apelido;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getOficio() {
		return oficio;
	}


	public void setOficio(String oficio) {
		this.oficio = oficio;
	}


	@Override
	public String toString() {
		return "Personagem [id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", genero=" + genero + ", idade="
				+ idade + ", pais=" + pais + ", oficio=" + oficio + "]";
	}
	
	
	

}
