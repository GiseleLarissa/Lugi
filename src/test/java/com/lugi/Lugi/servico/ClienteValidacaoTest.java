package com.lugi.Lugi.servico;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ClienteValidacaoTest {
	
	
	//Testes para nome
	@Test
	public void naoPodeValidarNomeComNumeros() {
		ClienteValidacao cliente = new ClienteValidacao();

		String nome = "Luciano Melquiades 393";
		String email = "luciano6@gmail.com";
		double cpf = 1937483728; 
		int celular = 340493343;
		//LocalDate dataDeNascimento ( 2000,10,6);
		
		
		boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, celular);
		
		assertEquals(false, ehUsuarioValido);
	}
	@Test
	public void naoPodeValidarNomeESobrenomeEscritosSemEspaco() {
		ClienteValidacao cliente = new ClienteValidacao();

		String nome = "LucianoMelquiades";
		String email = "luciano6@gmail.com";
		double cpf = 1937483728; 
		int celular = 340493343;
		//LocalDate dataDeNascimento ( 2000,10,6);
		
		
		boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, celular);
		
		assertEquals(false, ehUsuarioValido);
	}
	@Test
	public void permitirValidarComTudoCorreto() {
		ClienteValidacao cliente = new ClienteValidacao();

		String nome = "Luciano Melquiades";
		String email = "luciano6@gmail.com";
		double cpf = 1937483728; 
		int celular = 340493343;
		//LocalDate dataDeNascimento ( 2000,10,6);
		
		
		boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, celular);
		
		assertEquals(true, ehUsuarioValido);
	}
	
	
	//Testes para cpf 
	@Test
	public void permitirValidarComCpfcomPonto() {
		ClienteValidacao cliente = new ClienteValidacao();

		String nome = "Luciano Melquiades";
		String email = "luciano6@gmail.com";
		double cpf = 193748372-58; 
		int celular = 340493343;
		//LocalDate dataDeNascimento ( 2000,10,6);
		
		
		boolean ehUsuarioValido = cliente. validarCliente(nome, email, cpf, celular) ;
		
		assertEquals(true, ehUsuarioValido);
	}
	@Test
	public void permitirValidarComCpfsemPonto() {
		ClienteValidacao cliente = new ClienteValidacao();

		String nome = "Luciano Melquiades";
		String email = "luciano6@gmail.com";
		double cpf = 19837258; 
		int celular = 340493343;
		//LocalDate dataDeNascimento ( 2000,10,6);
		
		
		boolean ehUsuarioValido = cliente. validarCliente(nome, email, cpf, celular) ;
		
		assertEquals(true, ehUsuarioValido);
	}
	
	
	
	//Testes para email 
	
	@Test
	public void nãoPodesemArroba() {
		ClienteValidacao cliente = new ClienteValidacao();

		String nome = "Luciano Melquiades";
		String email = "luciano6gmail.com";
		double cpf = 1937483728; 
		int celular = 340493343;
		//LocalDate dataDeNascimento ( 2000,10,6);
		
		
		boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, celular);
		
		assertEquals(false, ehUsuarioValido);
	}

	@Test
	public void nãoPodesemPonto() {
		ClienteValidacao cliente = new ClienteValidacao();

		String nome = "Luciano Melquiades";
		String email = "luciano6gmailcom";
		double cpf = 1937483728; 
		int celular = 340493343;
		//LocalDate dataDeNascimento ( 2000,10,6);
		
		
		boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, celular);
		
		assertEquals(false, ehUsuarioValido);
	}
	
	@Test
	public void nãoPodeComCaracteresEspeciais() {
		ClienteValidacao cliente = new ClienteValidacao();

		String nome = "Luciano Melquiades";
		String email = "lu@c%ian#o6@gmail.com";
		double cpf = 1937483728; 
		int celular = 340493343;
		//LocalDate dataDeNascimento ( 2000,10,6);
		
		
		boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, celular);
		
		assertEquals(false, ehUsuarioValido);
	}
	
	
	
	
	//Testes para Celular 
	
	@Test
	public void permitirNoveNumeros() {
		ClienteValidacao cliente = new ClienteValidacao();

		String nome = "Luciano Melquiades";
		String email = "luciano6@gmail.com";
		double cpf = 1937483728; 
		int celular = 987085244;
		//LocalDate dataDeNascimento ( 2000,10,6);
		
		
		boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, celular);
		
		assertEquals(true, ehUsuarioValido);
	}
	

	@Test
	public void nãoPermitirMaisDeNoveNumeros() {
		ClienteValidacao cliente = new ClienteValidacao();

		String nome = "Luciano Melquiades";
		String email = "luciano6@gmail.com";
		double cpf = 1937483728; 
		int celular = 987879049;
		//LocalDate dataDeNascimento ( 2000,10,6);
		
		
		boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, celular);
		
		assertEquals(false, ehUsuarioValido);
	}
	
	
	
	//Testes para Data de nascimento 
	
	
}
