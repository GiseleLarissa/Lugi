package com.lugi.Lugi.servico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClienteValidacao {
	
	private static final String EMAIL_PATTERN = 
	        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	private static final String NOME_PATTERN = "^[A-Z][a-z]* [ [A-Z][a-z]]*";
	

	   private static final int[] pesoCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
	
	
	
	private static  Pattern pattern;
		
	private static Matcher matcher;
	

	public boolean validarCliente(String nome, String email,  String cpf, String contato,  int idade, String endereco){
		
		if(validarEmail(email) && validarNome(nome) && validarIdade(idade) && validarEndereco(endereco) && validarCpf(cpf) && validarContato(contato)) {
			return true;
		}
		return false;
	}

	

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
	
	 private static int calcularDigito(String str, int[] peso) {
	      int soma = 0;
	      for (int indice=str.length()-1, digito; indice >= 0; indice-- ) {
	         digito = Integer.parseInt(str.substring(indice,indice+1));
	         soma += digito*peso[peso.length-str.length()+indice];
	      }
	      soma = 11 - soma % 11;
	      return soma > 9 ? 0 : soma;
	   }
	
	public boolean validarCpf(String cpf) {
		
	      if ((cpf==null) || (cpf.length()!=11)) return false;

	      Integer digito1 = calcularDigito(cpf.substring(0,9), pesoCPF);
	      Integer digito2 = calcularDigito(cpf.substring(0,9) + digito1, pesoCPF);
	      return cpf.equals(cpf.substring(0,9) + digito1.toString() + digito2.toString());
	   }
	
	public boolean validarContato(CharSequence celular) {
		pattern = Pattern.compile(NOME_PATTERN, Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(celular);
		return matcher.matches();
		
	}

	private boolean validarIdade(int idade) {
			
			if ( idade <= 100  && idade > 18) {			
				return true;		
			}
			return false;  
		
		}
		
	public boolean validarEndereco(String endereco) {
		pattern = Pattern.compile(NOME_PATTERN, Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(endereco);
		return matcher.matches();
		
	}
}


