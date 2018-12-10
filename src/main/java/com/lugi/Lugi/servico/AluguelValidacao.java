package com.lugi.Lugi.servico;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AluguelValidacao {
	
private static final String N_PATTERN = "^[A-Z][a-z]* [ [A-Z][a-z]]*";
	
	private static  Pattern pattern;
		
	private static Matcher matcher;
	
	public boolean validarAluguel1(LocalDate data, LocalTime hora, CharSequence valorDaDiaria){
		
		if(validarData(data) && validarHora(hora) && validarValorDaDiaria(valorDaDiaria)) {
			return true;
		}
		return false;
	}
	
	public  boolean validarData(LocalDate data){
		
	}
	public  boolean validarHora(LocalTime hora){
		
	}
	
	public  boolean validarValorDaDiaria(CharSequence valorDaDiaria ){
		pattern = Pattern.compile(N_PATTERN, Pattern.CASE_INSENSITIVE);		
		matcher= pattern.matcher(valorDaDiaria);
	    return matcher.matches();
		
	}

	public boolean validarAluguel(LocalDate data, LocalTime hora, CharSequence valorDaDiaria) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
