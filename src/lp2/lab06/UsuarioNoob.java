package lp2.lab06;

import java.util.ArrayList;

import exceptions.ValorInvalidoException;

public class UsuarioNoob extends Usuario {

	public UsuarioNoob(String nomeUsuario, String login) throws Exception {
		super(nomeUsuario, login);
		this.dinheiro = 0;
		this.x2p = 0;
	}
	
	public void compra(Jogo jogo) throws Exception {
		if (desconto(jogo.getPreco()) > getDinheiro()) {
			throw new ValorInvalidoException("Saldo insuficiente");
		} else {
			setDinheiro(getDinheiro() - desconto(jogo.getPreco()));
			jogosComprados.add(jogo);
		}
		addX2p((int)jogo.getPreco()*10);
	}

	public double desconto(double preco) {
		return (preco - (0.1 * preco));
	}

}
