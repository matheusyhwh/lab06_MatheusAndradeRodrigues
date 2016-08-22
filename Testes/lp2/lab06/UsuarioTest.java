package lp2.lab06;

import static org.junit.Assert.*;

import org.junit.Test;

import lp2.lab06.Usuario;
import lp2.lab06.UsuarioNoob;
import lp2.lab06.UsuarioVeterano;

public class UsuarioTest {

	Usuario user1 = new UsuarioNoob("Usuario #1", "user1");
	Usuario user2 = new UsuarioVeterano("Usuario #2", "user2");
	Usuario user3 = new UsuarioNoob("Usuario #3", "user3");
	
	@Test
	public void testUsuario() {
		assertEquals(user1.getNomeUsuario(), "Usuario #1");
		assertNotEquals(user3.getNomeUsuario(), "Usuario #2");
		assertEquals(user1.getX2p(), 0);
		assertEquals(user2.getX2p(), 1000);
		assertNotEquals(user3.getX2p(), 1000);
		assertEquals(user2.getDinheiro(), 0, 0.01);
	}

	@Test
	public void testDesconto() {
		
	}

	@Test
	public void testCompra() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddDinheiro() {
		fail("Not yet implemented");
	}

	@Test
	public void testRegistraJogada() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetJogo() {
		fail("Not yet implemented");
	}

}
