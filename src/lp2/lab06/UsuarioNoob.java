package lp2.lab06;

import java.util.ArrayList;

public class UsuarioNoob extends Usuario {

	public UsuarioNoob(String nomeUsuario, String login) {
		super(nomeUsuario, login);
		this.dinheiro = 0;
		this.x2p = 0;
	}
	
	public void compra(Jogo jogo) throws Exception {
		if (jogo.getPreco() > getDinheiro()) {
			throw new Exception("Dinheiro insuficiente");
		} else {
			setDinheiro(getDinheiro() - desconto(jogo.getPreco()));
			jogosComprados.add(jogo);
		}
		setX2p((int)jogo.getPreco()*10);
	}

	public double desconto(double preco) {
		return (preco - (0.1 * preco));
	}

}
