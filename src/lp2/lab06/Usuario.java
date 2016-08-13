package lp2.lab06;

import java.util.ArrayList;

public class Usuario {
	String nomeUsuario;
	String login;
	ArrayList<Jogo> jogosComprados;
	double dinheiro;
	String tipoUsuario;
	int x2p;
	

	public Usuario(String nomeUsuario, String login, ArrayList<Jogo> jogosComprados, double dinheiro, String tipoUsuario, int x2p) {
		this.nomeUsuario = nomeUsuario;
		this.login = login;
		this.jogosComprados = jogosComprados;
		this.dinheiro = 0;
		this.tipoUsuario = tipoUsuario;
		this.x2p = 0;
	}

	public double desconto(double preco) {
		if (getTipoUsuario().equals("Veterano")) {
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
	
	public void addDinheiro(int montante) {
		setDinheiro(getDinheiro() + montante);
	}
	
	public void registraJogada(String nomeDoJogo, int score, boolean zerou) {
		
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
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

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	public int getX2p() {
		return x2p;
	}

	public void setX2p(String tipoUsuario) {
		this.x2p = x2p;
	}

}
