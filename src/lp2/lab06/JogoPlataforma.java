package lp2.lab06;

public class JogoPlataforma extends Jogo {

	public JogoPlataforma(String nome, double preco, int maiorScore, int qtdJogadas, int qtdZeramentos, Jogo tipo) {
		super(nome, preco, maiorScore, qtdJogadas, qtdZeramentos, tipo);
	}
	
	public int registraJogada(String nomeJogo, int maiorScore, boolean zerou) {
		return maiorScore;
		
	}
}
