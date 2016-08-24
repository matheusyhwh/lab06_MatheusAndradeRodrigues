package lp2.lab06;

import exceptions.*;

/**
 * 
 * @author Matheus Andrade Rodrigues
 *
 */
public class JogoPlataforma extends Jogo {
	/**
	 * 
	 * @param nome
	 * @param preco
	 * @throws Exception
	 */
	public JogoPlataforma(String nome, double preco) throws Exception {
		super(nome, preco);
	}

	@Override
	public int registraJogada(int score, boolean zerou) throws Exception {
		if (score < 0) {
			throw new ValorInvalidoException("Score nao pode ser negativo");
		}
		setQtdJogadas(getQtdJogadas() + 1);
		if (score > getMaxScore()) {
			setMaxScore(score);
		}
		if (zerou) {
			setQtdZeramentos(getQtdZeramentos() + 1);
			return 10;
		}
		return 0;
	}

	public String toString() {
		return "+ " + super.getNomeJogo() + " - Plataforma:\n==> Jogou " + super.getQtdJogadas()
				+ " vez(es).\n==> Zerou " + this.getQtdZeramentos() + " vez(es).\n==> Maior score: "
				+ this.getMaxScore();
	}
}
