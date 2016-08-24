package lp2.lab06;

import java.util.ArrayList;

import exceptions.*;

/**
 * 
 * @author Matheus Andrade Rodrigues
 *
 */
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
		addX2p((int) jogo.getPreco() * 15);
	}

	public double desconto(double preco) {
		return (preco - (0.2 * preco));
	}

	public String toString() {
		String toString = this.getLogin() + "\n" + this.getNomeUsuario() + " - ";
		toString += "Jogador Veterano\n";
		toString += "Lista de jogos:\n";
		toString += super.toString();
		toString += "\nTotal de preço dos jogos: R$ " + String.format("%.2f", getPrecoTotal());
		return toString;
	}

}
