package lp2.lab06;

import java.util.ArrayList;

import exceptions.LogicaException;

/**
 * 
 * @author mathe
 *
 */
public class Loja {
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>(); // qual
																	// eh...

	public Loja() {
		usuarios = new ArrayList<>();
	}// qual eh a diferenca?

	/**
	 * 
	 * @param login
	 * @return
	 * @throws Exception
	 */
	public Usuario getUsuario(String login) throws Exception {
		for (Usuario usuario : usuarios) {
			if (usuario.getLogin().equals(login)) {
				return usuario;
			}
		}
		throw new LogicaException("Usuario nao encontrado na lista");
	}

	/**
	 * 
	 * @param usuario
	 * @throws LogicaException
	 */
	public void addUsuario(Usuario usuario) throws LogicaException {
		if (!usuarios.contains(usuario)) {
			usuarios.add(usuario);
		}
		throw new LogicaException("Usuario ja existente");
	}

	/**
	 * 
	 * @param user
	 * @param montante
	 */
	public void addDinheiro(Usuario user, double montante) {
		user.addDinheiro(montante);
	}

	/**
	 * 
	 * @param login
	 * @param jogo
	 * @throws Exception
	 */
	public void vendaJogos(String login, Jogo jogo) throws Exception {
		if (usuarios.contains(getUsuario(login))) {
			getUsuario(login).compra(jogo);
		}
		throw new LogicaException("Usuario nao consta na lista de cadastros");
	}

	/**
	 * 
	 * @param usuario
	 * @throws Exception
	 */
	public void upgrade(UsuarioNoob usuario) throws Exception {
		UsuarioVeterano novoUsuario = new UsuarioVeterano(usuario.getNomeUsuario(), usuario.getLogin());
		novoUsuario.setDinheiro(usuario.getDinheiro());
		novoUsuario.setX2p(usuario.getX2p());
		novoUsuario.setJogosComprados(usuario.getJogosComprados());

		usuarios.remove(usuario);
		usuarios.add(novoUsuario);
	}

	public String toString() {
		String toString = "== Central P2-CG ==\n";
		for (Usuario usuario : usuarios) {
			toString += usuario + "\n";
		}
		return toString;
	}
}
