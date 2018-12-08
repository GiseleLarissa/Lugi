package com.lugi.Lugi.servico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClienteValidacao {
	
	private static final String EMAIL_PATTERN = 
	        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	private static final String NOME_PATTERN = "^[A-Z][a-z]* [ [A-Z][a-z]]*";
	
	private static final String CELULAR_PATTERN = "[0-9]{1,2}\\s[0-9]{4,5}[-][0-9]{4,5}";
	
	private static  Pattern pattern;
		
	private static Matcher matcher;
	

	public boolean validarCliente(String nome, String email,  double cpf, int celular) {
		
		if(validarEmail(email) && validarNome(nome) && validarCelular(celular)) {
			return true;
		}
		return false;
	}

	
	//public boolean validarCpf(double cpf) {}
	
	public  boolean validarEmail(String email){
		
	    pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);		
		matcher= pattern.matcher(email);
	    return matcher.matches();
	 
	}
	
	public boolean validarNome(String nome) {
		
		pattern = Pattern.compile(NOME_PATTERN, Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(nome);
		return matcher.matches();
	
	}
	
	public boolean validarCelular(int celular) {
		pattern = Pattern.compile(CELULAR_PATTERN, Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(celular);
		return matcher.matches();
		
	}
}


