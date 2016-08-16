package lp2.lab06;

import java.util.ArrayList;

public class UsuarioVeterano extends Usuario {
	public double DESCONTO = 0.2;
	
	public UsuarioVeterano(String nomeUsuario, String login, ArrayList<Jogo> jogosComprados, double dinheiro,
			String tipoUsuario, int x2p) {
		super(nomeUsuario, login, dinheiro, tipoUsuario, 1000);

	}

	
	public void compra(Jogo jogo) throws Exception {
			super.compra(jogo);
			setX2p((int)jogo.getPreco()*15);
	}

}
