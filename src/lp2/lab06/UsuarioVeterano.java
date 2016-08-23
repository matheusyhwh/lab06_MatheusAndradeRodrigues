package lp2.lab06;

import java.util.ArrayList;

import exceptions.ValorInvalidoException;

public class UsuarioVeterano extends Usuario {
	/**
	 * 
	 * @param nomeUsuario
	 * @param login
	 * @throws Exception
	 */
	public UsuarioVeterano(String nomeUsuario, String login) throws Exception {
		super(nomeUsuario, login);
		this.dinheiro = 0;
		this.x2p = 1000;
	}
	
	public void compra(Jogo jogo) throws Exception {
		if (desconto(jogo.getPreco()) > getDinheiro()) {
			throw new ValorInvalidoException("Saldo insuficiente");
		} else {
			setDinheiro(getDinheiro() - desconto(jogo.getPreco()));
			jogosComprados.add(jogo);
		}
		addX2p((int)jogo.getPreco()*15);
	}

	public double desconto(double preco) {
		return (preco - (0.2 * preco));
	}

}
