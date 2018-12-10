package com.lugi.Lugi.model;
import java.util.List;

import javax.persistence.*;

@Entity
public class Carro {

	@Id
	@GeneratedValue
	private Long id; 

	@Column
	private int ano;

	@Column
	private String modelo;

	@Column
	private String cor;

	@Column
	private float valorDaDiaria;
	
	@OneToMany 
	private List<Aluguel> aluguel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getValorDaDiaria() {
		return valorDaDiaria;
	}

	public void setValorDaDiaria(float valorDaDiaria) {
		this.valorDaDiaria = valorDaDiaria;
	}

	public List<Aluguel> getAluguel() {
		return aluguel;
	}

	public void setAluguel(List<Aluguel> aluguel) {
		this.aluguel = aluguel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluguel == null) ? 0 : aluguel.hashCode());
		result = prime * result + ano;
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + Float.floatToIntBits(valorDaDiaria);
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
		Carro other = (Carro) obj;
		if (aluguel == null) {
			if (other.aluguel != null)
				return false;
		} else if (!aluguel.equals(other.aluguel))
			return false;
		if (ano != other.ano)
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (Float.floatToIntBits(valorDaDiaria) != Float.floatToIntBits(other.valorDaDiaria))
			return false;
		return true;
	} 


}
