package lp2.lab06;

import java.util.HashSet;

public abstract class Jogo {
	private String nomeJogo;
	private double preco;
	private int maxScore;
	private int qtdJogadas;
	private int qtdZeramentos;
	private HashSet<String> jogabilidades;
	
	public Jogo(String nomeJogo, double preco) {
		this.nomeJogo = nomeJogo;
		this.preco = preco;
		this.maxScore = 0;
		this.qtdJogadas = 0;
		this.qtdZeramentos = 0;
		this.jogabilidades = new HashSet<String>();
	}

	public abstract int registraJogada(int score, boolean zerou);

	public void addEstilo(String estilo) {
		getJogabilidades().add(estilo);
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
	
	public int getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(int score) {
		this.maxScore = score;
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

	public HashSet<String> getJogabilidades() {
		return jogabilidades;
	}

	public void setJogabilidades(HashSet<String> jogabilidades) {
		this.jogabilidades = jogabilidades;
	}

}
