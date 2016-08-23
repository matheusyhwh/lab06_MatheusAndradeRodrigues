package lp2.lab06;

public class JogoLuta extends Jogo {

	public JogoLuta(String nome, double preco) throws Exception {
		super(nome, preco);
	}

	@Override
	public int registraJogada(int score, boolean zerou) throws Exception {
		if (score < 0) {
			throw new ValueException("Score nao pode ser negativo");
		}
		setQtdJogadas(getQtdJogadas() + 1);	
		if (zerou) {
			setQtdZeramentos(getQtdZeramentos() + 1);
		}	
		if (score > getMaxScore()) {
			setMaxScore(score);
			return (score/1000);
		}
		return 0;
	}
}
