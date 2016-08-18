package lp2.lab06;

import java.util.HashSet;

public abstract class Jogo {
	private String nomeJogo;
	private double preco;
	private int score;
	private int qtdJogadas;
	private int qtdZeramentos;
	HashSet<String> estilos;
	
	public Jogo(String nomeJogo, double preco) {
		this.nomeJogo = nomeJogo;
		this.preco = preco;
		this.score = 0;
		this.qtdJogadas = 0;
		this.qtdZeramentos = 0;
		estilos = new HashSet<String>();
	}

	public abstract int registraJogada(int score, boolean zerou);

	public void addEstilo(String estilo) {
		estilos.add(estilo);
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
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
