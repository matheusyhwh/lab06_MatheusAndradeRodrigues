package lp2.lab06;

import java.util.HashSet;

public class Jogo {
	private String nomeJogo;
	private double preco;
	private int maiorScore;
	private int qtdJogadas;
	private int qtdZeramentos;
	private Jogo tipo;

	HashSet<String> estilos = new HashSet();

	public Jogo(String nomeJogo, double preco, int maiorScore, int qtdJogadas, int qtdZeramentos, Jogo tipo) {
		this.nomeJogo = nomeJogo;
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
		if (zerou == true) {
			setQtdZeramentos(getQtdZeramentos() + 1);
		}
	}

	public void addEstilo(String estilo) {
		estilos.add(estilo);
	}

	public void addX2p(Jogo jogo, Jogo tipo) {
		
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
