package com.lugi.Lugi.servico;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.Test;

public class AluguelValidacaoTest {
	
	
	//TESTE PARA DATA 
	@Test
	public void naoPodeValidarDataCom() {
		AluguelValidacao aluguel = new AluguelValidacao();
		 
		LocalDate data = LocalDate.of(2014, 10, 10); 
		LocalTime hora = LocalTime.of(10, 20);
		CharSequence valorDaDiaria = "70.50"; 

		
		boolean ehUsuarioValido = aluguel .validarAluguel( data, hora,  valorDaDiaria);
		
		assertEquals(false, ehUsuarioValido);
	}
	

	//TESTE PARA DATA 
	@Test
	public void naoPodeValidarHoraCom() {
		AluguelValidacao aluguel = new AluguelValidacao();
		 
		LocalDate data = LocalDate.of(2014, 10, 10); 
		LocalTime hora = LocalTime.of(10, 20);
		CharSequence valorDaDiaria = "70.50"; 
 

		
		boolean ehUsuarioValido = aluguel .validarAluguel( data, hora,  valorDaDiaria);
		
		assertEquals(false, ehUsuarioValido);
	}
	
	
	//TESTE PRA VALOR 
	
	@Test
	public void naoPodeValidarValorSemPonto() {
		AluguelValidacao aluguel = new AluguelValidacao();
		 
		LocalDate data = LocalDate.of(2014, 10, 10); 
		LocalTime hora = LocalTime.of(10, 20);
		CharSequence valorDaDiaria = "70.50"; 


		
		boolean ehUsuarioValido = aluguel .validarAluguel( data, hora,  valorDaDiaria);
		
		assertEquals(false, ehUsuarioValido);
	}
	


}
