package lp2.lab06;

import lp2.lab06.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class UsuarioTest {
	Usuario user1;
	Usuario user2;
	Usuario user3;

	@Before
	public void setup() throws Exception {
		user1 = new UsuarioNoob("Usuario #1", "user1");
		user2 = new UsuarioVeterano("Usuario #2", "user2");
		user3 = new UsuarioNoob("Usuario #3", "user3");
	}

	@Test
	public void testUsuario() {
		assertEquals(user1.getNomeUsuario(), "Usuario #1");
		assertEquals(user1.getLogin(), "user1");
		assertNotEquals(user3.getNomeUsuario(), "Usuario #2");
		assertEquals(user1.getX2p(), 0);
		assertEquals(user2.getX2p(), 1000);
		assertNotEquals(user3.getX2p(), 1000);
		assertEquals(user2.getDinheiro(), 0, 0.01);
	}

	@Test
	public void testUsuarioException() throws Exception {
		try {
			assertEquals(user1.getNomeUsuario(), "Usuario #1");
		} catch (Exception e) {
			fail("Nao deve lancar Exception");
		}
		try {
			JogoRPG jogo = new JogoRPG("Diablo II", 2.99);
			user1.addDinheiro(9999);
			user1.compra(jogo);
			user1.registraJogada("Diablo II", 9999, true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(expected = Exception.class)
	public void testUsuarioNomeNulo() throws Exception {
		new UsuarioNoob(null, "max");
	}

	@Test(expected = Exception.class)
	public void testUsuarioNomeVazio() throws Exception {
		new UsuarioNoob("", "max");
	}

	@Test(expected = Exception.class)
	public void testUsuarioNomeLoginNulo() throws Exception {
		new UsuarioNoob("Maximov P.", null);
	}

	@Test(expected = Exception.class)
	public void testUsuarioNomeLoginVazio() throws Exception {
		new UsuarioNoob("Maximov P.", "");
	}

	@Test
	public void testDesconto() {
	}

	@Test
	public void testCompra() throws Exception {
		Jogo jogo = new JogoRPG("Jogo", 20);
		user1.setDinheiro(20);
		user2.setDinheiro(20);
		user1.compra(jogo);
		user2.compra(jogo);
		assertEquals((user1.getJogosComprados()).get(0), jogo);
		assertEquals(user1.getDinheiro(), 2, 0.01);
		assertEquals(user2.getDinheiro(), 4, 0.01);
		assertEquals(user1.getX2p(), 200);
	}

	@Test(expected = Exception.class)
	public void testCompraException() throws Exception {
		user2.setDinheiro(10);
		Jogo FFIX = new JogoRPG("Final Fantasy IX", 2000);
		user2.compra(FFIX);
	}

	@Test
	public void testAddDinheiro() {

	}

	@Test
	public void testRegistraJogada() {

	}

	@Test
	public void testGetJogo() {

	}

}
