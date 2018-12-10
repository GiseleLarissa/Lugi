package com.lugi.Lugi.servico;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ClienteValidacaoTest {
	
	
	//TESTE PARA NOME 
	@Test
	public void naoPodeValidarNomeComNumeros() {
		ClienteValidacao cliente = new ClienteValidacao();

		String nome = "Luciano Melquiades 35693";
		String email = "luciano6@gmail.com";
		String cpf = "1937483728"; 
		String contato = "88096080";
		int idade = 20;
		String endereco =" Rua tereza lins"; 
		
		
		boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, contato, idade, endereco);
		
		assertEquals(false, ehUsuarioValido);
	}
	@Test
	public void naoPodeValidarNomeESobrenomeEscritosSemEspaco() {
		ClienteValidacao cliente = new ClienteValidacao();
		
		String nome = "LucianoMelquiades";
		String email = "luciano6@gmail.com";
		String cpf = "1937483728"; 
		String contato = "88096080";
		int idade = 20;
		String endereco =" Rua tereza lins"; 
		
		
		boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, contato, idade, endereco);
		
		assertEquals(false, ehUsuarioValido);
	}
	
	
	//TESTE PARA EMAIL 
	
		@Test
		public void nãoPodesemArroba() {
			ClienteValidacao cliente = new ClienteValidacao();


			String nome = "LucianoMelquiades";
			String email = "luciano6gmail.com";
			String cpf = "1937483728"; 
			String contato = "88096080";
			int idade = 20;
			String endereco =" Rua tereza lins"; 
			
			
			boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, contato, idade, endereco);
			
			assertEquals(false, ehUsuarioValido);
		}

		@Test
		public void nãoPodesemPonto() {
			ClienteValidacao cliente = new ClienteValidacao();

			String nome = "LucianoMelquiades";
			String email = "luciano6@gmailcom";
			String cpf = "1937483728"; 
			String contato = "88096080";
			int idade = 20;
			String endereco =" Rua tereza lins"; 
			
			
			boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, contato, idade, endereco);
			
			assertEquals(false, ehUsuarioValido);
		}
		
		@Test
		public void nãoPodeComCaracteresEspeciais() {
			ClienteValidacao cliente = new ClienteValidacao();

			String nome = "Luciano Melquiades";
			String email = "lu@c%ian#o6@gmail.com";
			String cpf = "1937483728"; 
			String contato = "88096080";
			int idade = 20;
			String endereco =" Rua tereza lins"; 
			
			
			boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, contato, idade, endereco);
			
			
			assertEquals(false, ehUsuarioValido);
		}
	
	
	
		
		//TESTE PARA CPF  
		@Test
		public void nãopermitirValidarCpfComTracoEVirgula() {
			ClienteValidacao cliente = new ClienteValidacao();
			
			String nome = "Luciano Melquiades";
			String email = "luciano6@gmail.com";
			String cpf = "193-748,372-48"; 
			String contato = "88096080";
			int idade = 20;
			String endereco =" Rua tereza lins"; 
			
			
			boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, contato, idade, endereco);
			
			
			assertEquals(false, ehUsuarioValido);
		}
		@Test
		public void naopermitirValidarCpfComCaractEspecial() {
			ClienteValidacao cliente = new ClienteValidacao();
			
			String nome = "Luciano Melquiades";
			String email = "luciano6@gmail.com";
			String cpf = "193748372%4#8"; 
			String contato = "88096080";
			int idade = 20;
			String endereco =" Rua tereza lins"; 
			
			
			boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, contato, idade, endereco);
			
			
			assertEquals(false, ehUsuarioValido);
		}
		
		
		
	
		//TESTE PARA CONTATO 
		
		@Test
		public void naopermitirNumerosComEspaco() {
			ClienteValidacao cliente = new ClienteValidacao();
	
			String nome = "Luciano Melquiades";
			String email = "luciano6@gmail.com";
			String cpf = "193.748.372.48"; 
			String contato = "9 88096080";
			int idade = 20;
			String endereco =" Rua tereza lins"; 
			
			
			boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, contato, idade, endereco);
					
			assertEquals(false, ehUsuarioValido);
		}
		
		
		//TESTE PARA IDADE 
		
		@Test
		public void nãoPemitirValidarMenorDe18() {
			ClienteValidacao cliente = new ClienteValidacao();
	
			String nome = "Luciano Melquiades";
			String email = "luciano6@gmail.com";
			String cpf = "19374837248"; 
			String contato = "88096080";
			int idade = 15;
			String endereco =" Rua tereza lins"; 
			
			
			boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, contato, idade, endereco);
					
			assertEquals(false, ehUsuarioValido);
		}
		
		@Test
		public void nãoPemitirValidarMaiorDe100() {
			ClienteValidacao cliente = new ClienteValidacao();
	
			String nome = "Luciano Melquiades";
			String email = "luciano6@gmail.com"; 
			String cpf = "19374837248"; 
			String contato = "88096080";
			int idade = 101;
			String endereco =" Rua tereza lins"; 
			
			
			boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, contato, idade, endereco);
					
			assertEquals(false, ehUsuarioValido);
		}
		
		
		//TESTE PARA ENDERECO 
		@Test
		public void naoPodeValidarEnderecoEscritosSemEspaco() {
			ClienteValidacao cliente = new ClienteValidacao();
			
			String nome = "Luciano Melquiades";
			String email = "luciano6@gmail.com";
			String cpf = "19374837248"; 
			String contato = "88096080";
			int idade = 20;
			String endereco =" Ruaterezalins"; 
			
			
			boolean ehUsuarioValido = cliente.validarCliente(nome, email, cpf, contato, idade, endereco);
			
			assertEquals(false, ehUsuarioValido);
		}
		
		

	
	
	  
		
		
	
}
