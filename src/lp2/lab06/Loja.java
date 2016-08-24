package lp2.lab06;

import java.util.ArrayList;

import exceptions.*;
/**
 * 
 * @author Matheus Andrade Rodrigues
 *
 */
public class Loja {
	private ArrayList<Usuario> usuarios;

	public Loja() {
		usuarios = new ArrayList<>();
	}

	/**
	 * Pesquisa usuario por login na lista de cadastrados
	 * 
	 * @param login
	 * @return
	 * @throws Exception
	 */
	public Usuario getUsuario(String login) throws LogicaException {
		for (Usuario usuario : usuarios) {
			if (usuario.getLogin().equals(login)) {
				return usuario;
			}
		}
		throw new LogicaException("Usuario nao encontrado na lista");
	}

	/**
	 * Caso o usuario seja valido, o metodo addDinheiro dele sera chamado e o montante desejado sera adicionado como saldo em sua conta
	 * @param login
	 * @param montante
	 * @throws Exception
	 */
	public void addDinheiro(String login, double montante) throws Exception {
		try {
			getUsuario(login).addDinheiro(montante);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	/**
	 * Adiciona usuario na lista de cadastrados. Para evitar cadastros duplos,
	 * lanca exception se este usuario ja constar na lista
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
	 * @param login
	 * @param jogo
	 * @throws Exception
	 */
	public void vendaJogos(String login, Jogo jogo) throws Exception {
		try {
			getUsuario(login).compra(jogo);
		} catch (Exception e) {
			throw new LogicaException(e.getMessage());
		}
	}

	/**
	 * Este metodo promove o Noob para Veterano caso tenha conseguido atingir
	 * 1000 X2P. O usuario possuira os mesmos atributos que tinha antes do
	 * upgrade
	 * 
	 * @param usuarioAntigo
	 * @throws Exception
	 */
	public void upgrade(UsuarioNoob usuarioAntigo) throws Exception {
		UsuarioVeterano novoUsuario = new UsuarioVeterano(usuarioAntigo.getNomeUsuario(), usuarioAntigo.getLogin());
		novoUsuario.setDinheiro(usuarioAntigo.getDinheiro());
		novoUsuario.setX2p(usuarioAntigo.getX2p());
		novoUsuario.setJogosComprados(usuarioAntigo.getJogosComprados());
		addUsuario(novoUsuario);
		usuarios.remove(usuarioAntigo);
	}

	public String toString() {
		String toString = "== Central P2-CG ==\n";
		for (Usuario usuario : usuarios) {
			toString += usuario + "\n";
		}
		return toString;
	}
}
