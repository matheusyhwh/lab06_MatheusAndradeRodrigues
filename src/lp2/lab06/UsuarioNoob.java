package lp2.lab06;

import java.util.ArrayList;

import exceptions.*;

/**
 * 
 * @author Matheus Andrade Rodrigues
 *
 */
public class UsuarioNoob extends Usuario {
	/**
	 * 
	 * @param nomeUsuario
	 * @param login
	 * @throws Exception
	 */
	public UsuarioNoob(String nomeUsuario, String login) throws Exception {
		super(nomeUsuario, login);
		this.dinheiro = 0;
		this.x2p = 0;
	}

	public void compra(Jogo jogo) throws ValorInvalidoException {
		if (desconto(jogo.getPreco()) > getDinheiro()) {
			throw new ValorInvalidoException("Saldo insuficiente");
		} else {
			setDinheiro(getDinheiro() - desconto(jogo.getPreco()));
			jogosComprados.add(jogo);
		}
		addX2p((int) jogo.getPreco() * 10);
	}

	public double desconto(double preco) {
		return (preco - (0.1 * preco));
	}

	public String toString() {
		String toString = this.getLogin() + "\n" + this.getNomeUsuario() + " - ";
		toString += "Jogador Noob\n";
		toString += "Lista de jogos:\n";
		toString += super.toString();
		toString += "\nTotal de preço dos jogos: R$ " + String.format("%.2f", getPrecoTotal());
		return toString;
	}
}
