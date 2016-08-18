package lp2.lab06;

import java.util.ArrayList;

public abstract class Usuario {
	String nomeUsuario;
	String login;
	ArrayList<Jogo> jogosComprados = new ArrayList();
	double dinheiro;
	int x2p;

	public Usuario(String nomeUsuario, String login) {
		this.nomeUsuario = nomeUsuario;
		this.login = login;
		this.dinheiro = dinheiro;
		this.x2p = x2p;
	}

	public abstract double desconto(double preco);

	public abstract void compra(Jogo jogo) throws Exception;

	public void addDinheiro(double montante) {
		setDinheiro(getDinheiro() + montante);
	}

	public void registraJogada(String nomeDoJogo, int score, boolean zerou) {
		setX2p(getX2p() + getJogo(nomeDoJogo).registraJogada(score, zerou));
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

	public int getX2p() {
		return x2p;
	}

	public void setX2p(int x2p) {
		this.x2p = x2p;
	}

	public Jogo getJogo(String nome) {
		for (Jogo jogo : jogosComprados) {
			if (jogo.getNomeJogo().equals(nome)) {
				return jogo;
			}
		}
		return null; // ?
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Usuario))
			return false;
		Usuario other = (Usuario) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}
	
}
