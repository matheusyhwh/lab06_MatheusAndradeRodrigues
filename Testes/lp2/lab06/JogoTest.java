package lp2.lab06;

import static org.junit.Assert.*;

import org.junit.Test;

public class JogoTest {

	
	Jogo FFV = new JogoRPG("Final Fantasy V", 10000000);
	Jogo UMK3 = new JogoLuta("Ultimate Mortal Kombat 3", 29.90);
	Jogo SMW2 = new JogoPlataforma("Super Mario World 2 - Yoshi's Island", 30.00);
	
	
	@Test
	public void testJogo() {
		assertEquals(FFV.getNomeJogo(), "Final Fantasy V");
		assertNotEquals(UMK3.getNomeJogo(), "Super Mario World");
		assertNotEquals(SMW2.getNomeJogo(), "Super Mario World 2 - Yoshis Island");
		assert(FFV.getPreco() == 10000000);
		assert(UMK3.getPreco() != 10000000);
	}

	@Test
	public void testRegistraJogada() {
		FFV.registraJogada(200, false);
		FFV.registraJogada(57, false);
		assert(FFV.getQtdJogadas() == 2);
		assert(FFV.getMaiorScore() == 200);
	}

	@Test
	public void testAddEstilo() {
		UMK3.addEstilo("Multiplayer");
		assert(UMK3.estilos.add("Multiplayer"));
	}

	@Test
	public void testAddX2p() {
		fail("Not yet implemented");
	}

}
