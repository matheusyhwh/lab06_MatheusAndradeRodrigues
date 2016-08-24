package lp2.lab06;

import exceptions.*;

/**
 * 
 * @author Matheus Andrade Rodrigues
 *
 */
public class JogoLuta extends Jogo {
	/**
	 * Cria um jogo de Luta, utilizando o construtor da superclasse Jogo
	 * @param nome
	 * @param preco
	 * @throws Exception
	 */
	public JogoLuta(String nome, double preco) throws Exception {
		super(nome, preco);
	}

	@Override
	public int registraJogada(int score, boolean zerou) throws Exception {
		if (score < 0) {
			throw new ValorInvalidoException("Score nao pode ser negativo");
		}
		setQtdJogadas(getQtdJogadas() + 1);
		if (zerou) {
			setQtdZeramentos(getQtdZeramentos() + 1);
		}
		if (score > getMaxScore()) {
			setMaxScore(score);
			return (score / 1000);
		}
		return 0;
	}
	@Override
	public String toString() {
		return "+ " + super.getNomeJogo() + " - Luta:\n==> Jogou " + super.getQtdJogadas() + " vez(es).\n==> Zerou "
				+ this.getQtdZeramentos() + " vez(es).\n==> Maior score: " + this.getMaxScore();
	}
}
