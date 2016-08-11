package lp2.lab06;

import java.util.HashSet;

public class Jogo {
	private String nome;
	private double preco;
	private int maiorScore;
	private int qtdJogadas;
	private int qtdZeramentos;
	private String tipo;
	
	HashSet <String> estilos = new HashSet();
	
	public Jogo(String nome, double preco, int maiorScore, int qtdJogadas, int qtdZeramentos, String tipo) {
		this.nome = nome;
		this.preco = preco;
		this.maiorScore = 0;
		this.qtdJogadas = 0;
		this.qtdZeramentos = 0;
		this.tipo = tipo;
	}
	
	public void registraJogada(int score, boolean zerou) {
		if (score > maiorScore) {
			setMaiorScore(score);
		}
		if (zerou == true){
			setQtdZeramentos(getQtdZeramentos() + 1);
		}
	}
	public void addEstilo(String estilo) {
		estilos.add(estilo);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getMaiorScore() {
		return maiorScore;
	}

	public void setMaiorScore(int maiorScore) {
		this.maiorScore = maiorScore;
	}

	public int getQtdJogadas() {
		return qtdJogadas;
	}

	public void setQtdJogadas(int qtdJogadas) {
		this.qtdJogadas = qtdJogadas;
	}

	public int getQtdZeramentos() {
		return qtdZeramentos;
	}

	public void setQtdZeramentos(int qtdZeramentos) {
		this.qtdZeramentos = qtdZeramentos;
	}
	
}
