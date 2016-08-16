package lp2.lab06;

import java.util.ArrayList;

public class UsuarioNoob extends Usuario {
	public double DESCONTO = 0.1;

	public UsuarioNoob(String nomeUsuario, String login, ArrayList<Jogo> jogosComprados, double dinheiro,
			String tipoUsuario, int x2p) {
		super(nomeUsuario, login, 0, tipoUsuario, 0);

	}
	
	public void compra(Jogo jogo) throws Exception {
		setX2p((int)jogo.getPreco()*15);
	}

}
