package lp2.lab06;

import static org.junit.Assert.*;

import org.junit.Test;

import lp2.lab06.Jogo;
import lp2.lab06.JogoLuta;
import lp2.lab06.JogoPlataforma;
import lp2.lab06.JogoRPG;


public class JogoTest {

	
	Jogo FFV = new JogoRPG("Final Fantasy V", 10000);
	Jogo UMK3 = new JogoLuta("Ultimate Mortal Kombat 3", 29.90);
	Jogo SMW2 = new JogoPlataforma("Super Mario World 2 - Yoshi's Island", 30.00);
	
	
	@Test
	public void testJogo() {
		assertEquals(FFV.getNomeJogo(), "Final Fantasy V");
		assertNotEquals(UMK3.getNomeJogo(), "Super Mario World");
		assertNotEquals(SMW2.getNomeJogo(), "Super Mario World 2 - Yoshis Island");
		assertEquals(FFV.getPreco(), 10000, 0.01);
		assertNotEquals(UMK3.getPreco(), 10000, 0.01);
	}

	@Test
	public void testRegistraJogada() {
		FFV.registraJogada(410, false);
		FFV.registraJogada(57, false);
		assertEquals(FFV.getQtdJogadas(), 2);
		assertEquals(FFV.getMaxScore(), 410);
	}

	@Test
	public void testAddEstilo() {
		int oldSize = UMK3.getJogabilidades().size();
		UMK3.addEstilo("Multiplayer");
		int newSize = UMK3.getJogabilidades().size();
		assertTrue(newSize > oldSize);
		UMK3.addEstilo("Multiplayer");
		int finalSize = UMK3.getJogabilidades().size();
		assert(finalSize == newSize);
	}

}
