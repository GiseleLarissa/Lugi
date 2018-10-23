package com.lugi.Lugi.model;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
public class Cliente {
	
	
@Id
@GeneratedValue
private Long id;

@Column
private String nome;

@Column
private String Email;

@Column
private double CPF;

@Column
private double Celular;

@Column 
private LocalDate DatadeNascimento;

@OneToOne
private Aluguel aluguel;



public Cliente(Long id, String nome, String email, double cPF, double celular, LocalDate datadeNascimento,
		Aluguel aluguel) {
	super();
	this.id = id;
	this.nome = nome;
	Email = email;
	CPF = cPF;
	Celular = celular;
	DatadeNascimento = datadeNascimento;
	this.aluguel = aluguel;
}


public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public double getCPF() {
	return CPF;
}

public void setCPF(double cPF) {
	CPF = cPF;
}

public double getCelular() {
	return Celular;
}

public void setCelular(double celular) {
	Celular = celular;
}

public LocalDate getDatadeNascimento() {
	return DatadeNascimento;
}

public void setDatadeNascimento(LocalDate datadeNascimento) {
	DatadeNascimento = datadeNascimento;
}

public Aluguel getAluguel() {
	return aluguel;
}

public void setAluguel(Aluguel aluguel) {
	this.aluguel = aluguel;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(CPF);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(Celular);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((DatadeNascimento == null) ? 0 : DatadeNascimento.hashCode());
	result = prime * result + ((Email == null) ? 0 : Email.hashCode());
	result = prime * result + ((aluguel == null) ? 0 : aluguel.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cliente other = (Cliente) obj;
	if (Double.doubleToLongBits(CPF) != Double.doubleToLongBits(other.CPF))
		return false;
	if (Double.doubleToLongBits(Celular) != Double.doubleToLongBits(other.Celular))
		return false;
	if (DatadeNascimento == null) {
		if (other.DatadeNascimento != null)
			return false;
	} else if (!DatadeNascimento.equals(other.DatadeNascimento))
		return false;
	if (Email == null) {
		if (other.Email != null)
			return false;
	} else if (!Email.equals(other.Email))
		return false;
	if (aluguel == null) {
		if (other.aluguel != null)
			return false;
	} else if (!aluguel.equals(other.aluguel))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	return true;
} 







}


