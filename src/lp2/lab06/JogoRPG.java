package lp2.lab06;

import exceptions.ValorInvalidoException;

/**
 * 
 * @author mathe
 *
 */
public class JogoRPG extends Jogo {
	/**
	 * 
	 * @param nome
	 * @param preco
	 * @throws Exception
	 */
	public JogoRPG(String nome, double preco) throws Exception {
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
		}
		return 10; // cada vez que jogou, +10
	}
}
