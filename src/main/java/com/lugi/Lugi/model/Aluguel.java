package com.lugi.Lugi.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.*;



@Entity 
public class Aluguel {

	@Id
	@GeneratedValue
	private Long id; 
	
	@Column
	private LocalDate data; 
	@Column
	private LocalTime hora; 


	@Column 
	private double valorDaDiaria;

	@Enumerated(EnumType.STRING)
	private TipoPagamento tipoPagamento;
	
	@OneToOne
	private Cliente clientes; 

	@OneToMany
	private List<Carro> carros;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public LocalDate getData() {
		return data;
	}

	public double getValorDaDiaria() {
		return valorDaDiaria;
	}

	public void setValorDaDiaria(double valorDaDiaria) {
		this.valorDaDiaria = valorDaDiaria;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public Cliente getClientes() {
		return clientes;
	}

	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carros == null) ? 0 : carros.hashCode());
		result = prime * result + ((clientes == null) ? 0 : clientes.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((hora == null) ? 0 : hora.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tipoPagamento == null) ? 0 : tipoPagamento.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorDaDiaria);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Aluguel other = (Aluguel) obj;
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
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (hora == null) {
			if (other.hora != null)
				return false;
		} else if (!hora.equals(other.hora))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tipoPagamento != other.tipoPagamento)
			return false;
		if (Double.doubleToLongBits(valorDaDiaria) != Double.doubleToLongBits(other.valorDaDiaria))
			return false;
		return true;
	}

	
	 
}
