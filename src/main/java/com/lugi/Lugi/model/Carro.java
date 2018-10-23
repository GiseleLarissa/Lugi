package com.lugi.Lugi.model;
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
	private int quilometragem;

	@Column
	private String cor;

	@Column
	private float valorDaDiaria;

	public Carro(Long id, int ano, String modelo, int quilometragem, String cor, float valorDaDiaria) {
		super();
		this.id = id;
		this.ano = ano;
		this.modelo = modelo;
		this.quilometragem = quilometragem;
		this.cor = cor;
		this.valorDaDiaria = valorDaDiaria;
	}

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

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + quilometragem;
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
		if (quilometragem != other.quilometragem)
			return false;
		if (Float.floatToIntBits(valorDaDiaria) != Float.floatToIntBits(other.valorDaDiaria))
			return false;
		return true;
	}













}
