package com.lugi.Lugi.model;
import java.util.List;

import javax.persistence.*;

@Entity
public class Locadora {
	
	@Id
	@GeneratedValue
	 private Long id; 

	@Column
	private int cnpj;
	
	@Column
	private String endereco;
	
	@Column
	private double Contato;
	
	@OneToMany
	private List<Carro> carros;
	
	@OneToMany
	private List<Cliente> clientes;

	public Locadora(Long id, int cnpj, String endereco, double contato, List<Carro> carros, List<Cliente> clientes) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.endereco = endereco;
		Contato = contato;
		this.carros = carros;
		this.clientes = clientes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getContato() {
		return Contato;
	}

	public void setContato(double contato) {
		Contato = contato;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros.clear();
		this.carros.addAll(carros);
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes.clear();
		this.clientes.addAll(clientes);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(Contato);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((carros == null) ? 0 : carros.hashCode());
		result = prime * result + ((clientes == null) ? 0 : clientes.hashCode());
		result = prime * result + cnpj;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Locadora other = (Locadora) obj;
		if (Double.doubleToLongBits(Contato) != Double.doubleToLongBits(other.Contato))
			return false;
		if (carros == null) {
			if (other.carros != null)
				return false;
		} else if (!carros.equals(other.carros))
			return false;
		if (clientes == null) {
			if (other.clientes != null)
				return false;
		} else if (!clientes.equals(other.clientes))
			return false;
		if (cnpj != other.cnpj)
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

	
	
}
