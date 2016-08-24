package lp2.lab06;

import java.util.ArrayList;

import exceptions.*;

/**
 * 
 * @author Matheus Andrade Rodrigues
 *
 */
public abstract class Usuario {
	String nomeUsuario;
	String login;
	ArrayList<Jogo> jogosComprados;
	double dinheiro;
	int x2p;

	/**
	 * Construtor de Usuario, superclasse para UsuarioNoob e UsuarioVeterano
	 * @param nomeUsuario
	 * @param login
	 * @throws StringNulaOuVaziaException
	 * @throws ValorInvalidoException
	 */
	public Usuario(String nomeUsuario, String login) throws StringNulaOuVaziaException, ValorInvalidoException {
		if (nomeUsuario == null || nomeUsuario.isEmpty()) {
			throw new StringNulaOuVaziaException("Nome do usuario nao deve ser nulo ou vazio.");
		}
		if (login == null || login.isEmpty()) {
			throw new StringNulaOuVaziaException("Login do usuario nao deve ser nulo ou vazio.");
		}
		this.nomeUsuario = nomeUsuario;
		this.login = login;
		this.dinheiro = dinheiro;
		this.x2p = x2p;
		this.jogosComprados = new ArrayList();
	}

	/**
	 *Metodo desconto possui comportamentos diferentes para Usuarios Noobs e Veteranos. Os veteranos possuem um desconto maior.
	 * @param preco
	 * @return
	 */
	public abstract double desconto(double preco);

	/**
	 * Metodo verifica se usuario possui dinheiro suficiente para comprar o jogo. Se nao, lancara uma Excecao. Se sim, adicionara o jogo na lista de jogos comprados daquele usuario e adiciona X2p
	 * @param jogo
	 * @throws Exception
	 */
	public abstract void compra(Jogo jogo) throws Exception;

	/**
	 * @param montante
	 */
	public void addDinheiro(double montante) {
		setDinheiro(getDinheiro() + montante);
	}

	/**
	 * @param x2p
	 */
	public void addX2p(int x2p) {
		setX2p(getX2p() + x2p);
	}

	/**
	 * Metodo procura determinado jogo na lista de Jogos comprados. Se achado, fara o registraJogada daquele respectivo jogo. 
	 * @param nomeDoJogo
	 * @param score
	 * @param zerou
	 * @throws Exception
	 */
	public void registraJogada(String nomeDoJogo, int score, boolean zerou) throws Exception {
		if (nomeDoJogo == null || nomeDoJogo.isEmpty()) {
			throw new StringNulaOuVaziaException("Nome do jogo nao deve ser nulo ou vazio");
		}
		if (score < 0) {
			throw new ValorInvalidoException("Score nao pode ser negativo");
		}
		Jogo jogo = getJogo(nomeDoJogo);
		addX2p(jogo.registraJogada(score, zerou));
	}
	
	/**
	 * Verifica se ha um jogo de determinado nome na lista de jogos comprados
	 * @param nome
	 * @return
	 * @throws LogicaException
	 */
	public Jogo getJogo(String nome) throws LogicaException {
		for (Jogo jogo : jogosComprados) {
			if (jogo.getNomeJogo().equals(nome)) {
				return jogo;
			}
		}
		throw new LogicaException("Jogo nao contido na lista");
	}
	/**
	 * Calcula o total de custo dos jogos
	 * @return Total
	 */
	public double getPrecoTotal() {
		double Total = 0.00;
		for (Jogo jogo : jogosComprados) {
			Total += jogo.getPreco();
		}
		return Total;
	}


	/* Gets e Sets */
	
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

	/* HashCode, Equals e toString */
	
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
		if (obj instanceof Usuario) {
			Usuario user = (Usuario) obj;
			return user.getLogin().equals(this.getLogin());
		}
		return false;
	}


	public String toString() {
		String toString = "";
		for (Jogo jogo : jogosComprados) {
			toString += jogo + "\n";
		}
		return toString;
	}

}
