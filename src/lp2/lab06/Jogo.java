package lp2.lab06;

import java.util.HashSet;

import enumerations.Jogabilidades;
import exceptions.*;

/**
 * 
 * @author Matheus Andrade Rodrigues
 *
 */
public abstract class Jogo {
	private String nomeJogo;
	private double preco;
	private int maxScore;
	private int qtdJogadas;
	private int qtdZeramentos;
	private HashSet<Jogabilidades> jogabilidades;

	/**
	 *  Construtor da classe Jogo, superclasse de JogoRPG, JogoPlataforma e JogoLuta
	 * @param nomeJogo
	 * @param preco
	 * @throws StringNulaOuVaziaException
	 * @throws ValorInvalidoException
	 */
	public Jogo(String nomeJogo, double preco) throws StringNulaOuVaziaException, ValorInvalidoException {
		if (nomeJogo == null || nomeJogo.isEmpty()) {
			throw new StringNulaOuVaziaException("Nome nao pode ser nulo ou vazio");
		}
		if (preco < 0) {
			throw new ValorInvalidoException("Preco nao pode ser negativo");
		}
		this.nomeJogo = nomeJogo;
		this.preco = preco;
		this.maxScore = 0;
		this.qtdJogadas = 0;
		this.qtdZeramentos = 0;
		this.jogabilidades = new HashSet<Jogabilidades>();
	}

	/**
	 * Registra jogada é um método abstrato, redirecionará para o registra jogada de JogoRPG, JogoLuta e JogoPlataforma
	 * Em cada subclasse, terá um comportamento ligeiramente diferente. 
	 * @param score
	 * @param zerou
	 * @return
	 * @throws Exception
	 */
	public abstract int registraJogada(int score, boolean zerou) throws Exception;

	/**
	 * Adicona um dos estilos definidos na classe Jogabilidades
	 * @param jogabilidade
	 */
	public void addEstilo(Jogabilidades estilo) {
		getJogabilidades().add(estilo);
	}
	
	/* Gets e Sets */
	
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

	public HashSet<Jogabilidades> getJogabilidades() {
		return jogabilidades;
	}

	public void setJogabilidades(HashSet<Jogabilidades> jogabilidades) {
		this.jogabilidades = jogabilidades;
	}

	/* HashCode, Equals e toString */
	
	public abstract String toString();
}
