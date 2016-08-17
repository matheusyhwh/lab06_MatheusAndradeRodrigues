package lp2.lab06;

import java.util.ArrayList;

public class UsuarioNoob extends Usuario {

	,0. +
	public UsuarioNoob(String nomeUsuario, String login, double dinheiro,
			String tipoUsuario, int x2p) {
		super(nomeUsuario, login, 0, tipoUsuario, 0);
	}
	
	public void compra(Jogo jogo) throws Exception {
		if (jogo.getPreco() > getDinheiro()) {
			throw new Exception("Dinheiro insuficiente");
		} else {
			setDinheiro(getDinheiro() - desconto(jogo.getPreco()));
			jogosComprados.add(jogo);
		}
		setX2p((int)jogo.getPreco()*15);
	}

	public double desconto(double preco) {
		return (preco - (0.1 * preco));
	}

}
