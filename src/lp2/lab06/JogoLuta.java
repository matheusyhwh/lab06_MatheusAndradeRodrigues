package lp2.lab06;

public class JogoLuta extends Jogo {

	public JogoLuta(String nome, double preco) {
		super(nome, preco);
	}

	@Override
	public int registraJogada(int score, boolean zerou) {
		setQtdJogadas(getQtdJogadas() + 1);	
		if (zerou == true) {
			setQtdZeramentos(getQtdZeramentos() + 1);
		}	
		if (score > getScore()) {
			setScore(score);
			return (score/1000);
		}
		return 0;
	}
}
