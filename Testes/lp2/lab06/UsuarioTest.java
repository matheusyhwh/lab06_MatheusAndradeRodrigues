package lp2.lab06;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsuarioTest {

	@Test
	public void testUsuario() throws Exception {
		try {
			Usuario user1 = new UsuarioNoob("Usuario #1", "user1");
			Usuario user2 = new UsuarioVeterano("Usuario #2", "user2");
			Usuario user3 = new UsuarioNoob("Usuario #3", "user3");
			UsuarioNoob usuario = new UsuarioNoob("Lucas Andrade Rodrigues", "lucasar");
			assertEquals("Lucas Andrade Rodrigues", usuario.getNomeUsuario());
			assertEquals("lucasar", usuario.getLogin());
			assertEquals(user1.getNomeUsuario(), "Usuario #1");
			assertNotEquals(user3.getNomeUsuario(), "Usuario #2");
			assertEquals(user1.getX2p(), 0);
			assertEquals(user2.getX2p(), 1000);
			assertNotEquals(user3.getX2p(), 1000);
			assertEquals(user2.getDinheiro(), 0, 0.01);
		} catch (Exception e) {
			fail("Não deve lançar Exception");
		}
		try {
			JogoRPG jogo = new JogoRPG("Diablo II", 2.99);
			UsuarioNoob usuario = new UsuarioNoob("Matheus", "MatheusMelo");
			usuario.setDinheiro(usuario.getDinheiro() + 9999);
			usuario.compra(jogo);
			usuario.registraJogada("Diablo II", 9999, true);
			System.out.println(usuario);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(expected = Exception.class)
	public void testUsuarioNomeVazio() throws Exception {
		new UsuarioNoob("", "max");
	}

	@Test(expected = Exception.class)
	public void testUsuarioNomeNulo() throws Exception {
		new UsuarioNoob(null, "max");
	}

	@Test(expected = Exception.class)
	public void testUsuarioNomeLoginVazio() throws Exception {
		new UsuarioNoob("Maximov P.", "");
	}

	@Test(expected = Exception.class)
	public void testUsuarioNomeLoginNulo() throws Exception {
		new UsuarioNoob("Maximov P.", null);
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
