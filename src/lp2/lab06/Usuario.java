package lp2.lab06;

import java.util.ArrayList;

public class Usuario {
	String nome;
	String login;
	ArrayList<Jogo> jogosComprados;
	double dinheiro;
	String tipo;

	public Usuario(String nome, String login, ArrayList<Jogo> jogosComprados, double dinheiro, String tipo) {
		super();
		this.nome = nome;
		this.login = login;
		this.jogosComprados = jogosComprados;
		this.dinheiro = dinheiro;
		this.tipo = tipo;
	}

	public double desconto(double preco) {
		if (tipo.equals("Veterano")) {
			return (preco - (0.2 * preco));
		} else {
			return (preco - (0.2 * preco));
		}

	}

	public void compra(Jogo jogo) throws Exception {
		if (jogo.getPreco() > dinheiro) {
			throw new Exception("Dinheiro insuficiente");
		} else {
			setDinheiro(dinheiro - desconto(jogo.getPreco()));
			jogosComprados.add(jogo);
		}
	}

	public void registraJogada(String nomeDoJogo, int score, boolean zerou) {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public ArrayList<Jogo> getJogosComprados() {
		return jogosComprados;
	}

	public void setJogosComprados(ArrayList<Jogo> jogosComprados) {
		this.jogosComprados = jogosComprados;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
