package lp2.lab06;

public class JogoRPG extends Jogo {

	public JogoRPG(String nome, double preco) {
		super(nome, preco);
	}
	
	@Override
	public int registraJogada(int score, boolean zerou) {
		setQtdJogadas(getQtdJogadas() + 1);
		if (score > getScore()) {
			setScore(score);
		}
		if (zerou == true) {
			setQtdZeramentos(getQtdZeramentos() + 1);
		}
		return 10; // cada vez que jogou, +10
	}
}
