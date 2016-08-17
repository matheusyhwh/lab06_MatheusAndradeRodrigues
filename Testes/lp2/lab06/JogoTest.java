package lp2.lab06;

import static org.junit.Assert.*;

import org.junit.Test;

public class JogoTest {

	
	Jogo FFV = new JogoRPG("Final Fantasy V", 10000000);
	Jogo UMK3 = new JogoRPG("Ultimate Mortal Kombat 3", 29.90);
	
	@Test
	public void testJogo() {
		assertEquals(FFV.getNomeJogo(), "Final Fantasy V");
		assertNotEquals(UMK3.getNomeJogo(), "Super Mario World");
		assert(FFV.getPreco() == 10000000);
		assert(UMK3.getPreco() != 10000000);
	}

	@Test
	public void testRegistraJogada() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddEstilo() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddX2p() {
		fail("Not yet implemented");
	}

}
