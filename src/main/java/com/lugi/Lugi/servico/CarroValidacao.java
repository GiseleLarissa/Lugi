package com.lugi.Lugi.servico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CarroValidacao {
	
	
	private static final String MODELO_PATTERN = "^[A-Z][a-z]* [ [A-Z][a-z]]*";
	
	private static  Pattern pattern;
		
	private static Matcher matcher;
	

	public boolean validarCarro(int ano, String modelo, String cor, CharSequence valorDaDiaria){
		
		if(validarAno(ano) && validarModelo(modelo) && validarCor(cor) && validarValorDaDiaria(valorDaDiaria)) {
			return true;
		}
		return false;
	}
	
	public  boolean validarAno(int ano){
		if ( ano <= 2018  && ano> 0) {			
			return true;		
		}
		return false;  
	
	}
	
	public  boolean validarModelo(String modelo){
		    pattern = Pattern.compile(MODELO_PATTERN, Pattern.CASE_INSENSITIVE);		
			matcher= pattern.matcher(modelo);
		    return matcher.matches();
		
	}
	public  boolean validarCor(String cor ){
		pattern = Pattern.compile(MODELO_PATTERN, Pattern.CASE_INSENSITIVE);		
		matcher= pattern.matcher(cor);
	    return matcher.matches();
		
	}
	public  boolean validarValorDaDiaria(CharSequence valorDaDiaria ){
		pattern = Pattern.compile(MODELO_PATTERN, Pattern.CASE_INSENSITIVE);		
		matcher= pattern.matcher(valorDaDiaria);
	    return matcher.matches();
		
	}
	
	
	
	

}
