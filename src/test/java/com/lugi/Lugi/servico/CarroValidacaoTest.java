package com.lugi.Lugi.servico;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarroValidacaoTest {

	//TESTE PARA ANO 
	
	@Test
	public void naoPodeValidarAnoNegativo() {
		CarroValidacao carro = new CarroValidacao();
		int ano = -1999;
		String modelo= "Camaro"; 
		String cor = "Amarela"; 
		CharSequence valorDaDiaria = "70.50"; 

		boolean ehUsuarioValido = carro.validarCarro(ano, modelo, cor, valorDaDiaria);
		
		assertEquals(false, ehUsuarioValido);		
	}
	@Test
	public void naoPodeValidarAnoMaiorQue2018() {
		CarroValidacao  carro = new CarroValidacao();
		int ano = 2030;
		String modelo= "Camaro"; 
		String cor = "Amarela"; 
		CharSequence valorDaDiaria = "70.50"; 

		boolean ehUsuarioValido = carro.validarCarro(ano, modelo, cor, valorDaDiaria);
		
		assertEquals(false, ehUsuarioValido);		
	}
	
	//TESTE PARA MODELO 
	
	@Test
	public void naoPodeValidarModeloComCacterEspeciais() {
		CarroValidacao  carro = new CarroValidacao();
		int ano = 2010;
		String modelo= "Ca#mar%o"; 
		String cor = "Amarela"; 
		CharSequence valorDaDiaria = "70.50";  

		boolean ehUsuarioValido = carro.validarCarro(ano, modelo, cor, valorDaDiaria);
		
		assertEquals(false, ehUsuarioValido);
		
	}
	
	
	//TESTE PARA COR 
	
	@Test
	public void naoPodeValidarCorComNumeros() {
		CarroValidacao  carro = new CarroValidacao();
		int ano = 2010;
		String modelo= "Camaro"; 
		String cor = "Amarela 123"; 
		CharSequence valorDaDiaria = "70.50";  

		boolean ehUsuarioValido = carro.validarCarro(ano, modelo, cor, valorDaDiaria);
		
		assertEquals(false, ehUsuarioValido);
		
		
	}
	
	
	//TESTE PARA VALOR 
	@Test
	public void naoPodeValidarSemPonto() {
		CarroValidacao  carro = new CarroValidacao();
		int ano = 2010;
		String modelo= "Camaro"; 
		String cor = "Amarela"; 
		CharSequence valorDaDiaria = "7050"; 

		boolean ehUsuarioValido = carro.validarCarro(ano, modelo, cor, valorDaDiaria);
		
		assertEquals(false, ehUsuarioValido);
		
	}
	
}
