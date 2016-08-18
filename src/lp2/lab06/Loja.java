package lp2.lab06;

import java.util.HashSet;

public class Loja {
	private HashSet<Usuario> usuarios = new HashSet<Usuario>();
	
	public void addUsuario(Usuario user) {
		usuarios.add(user);
	}
	
	public void addDinheiro(Usuario user, double montante) {
		user.addDinheiro(montante);
	}
	
		
}
