package lp2.lab06;

public class JogoPlataforma extends Jogo {

	public JogoPlataforma(String nome, double preco) throws Exception {
		super(nome, preco);
	}
	
	@Override
	public int registraJogada(int score, boolean zerou) {
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
}
