package com.lugi.Lugi.model;

import java.time.LocalDateTime;

import javax.persistence.*;



@Entity 
public class Aluguel {

	@Id
	@GeneratedValue
	private Long id; 

	@Column
	private LocalDateTime dataHoradoAluguel;

	@Column
	private int quilometragePercorrida;

	@Column 
	private float valor;

	@Enumerated(EnumType.STRING)
	private TipoPagamento tipoPagamento;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public LocalDateTime getDataHoradoAluguel() {
		return dataHoradoAluguel;
	}



	public void setDataHoradoAluguel(LocalDateTime dataHoradoAluguel) {
		this.dataHoradoAluguel = dataHoradoAluguel;
	}



	public int getQuilometragePercorrida() {
		return quilometragePercorrida;
	}



	public void setQuilometragePercorrida(int quilometragePercorrida) {
		this.quilometragePercorrida = quilometragePercorrida;
	}



	public float getValor() {
		return valor;
	}



	public void setValor(float valor) {
		this.valor = valor;
	}



	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}



	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataHoradoAluguel == null) ? 0 : dataHoradoAluguel.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + quilometragePercorrida;
		result = prime * result + ((tipoPagamento == null) ? 0 : tipoPagamento.hashCode());
		result = prime * result + Float.floatToIntBits(valor);
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
		if (dataHoradoAluguel == null) {
			if (other.dataHoradoAluguel != null)
				return false;
		} else if (!dataHoradoAluguel.equals(other.dataHoradoAluguel))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (quilometragePercorrida != other.quilometragePercorrida)
			return false;
		if (tipoPagamento != other.tipoPagamento)
			return false;
		if (Float.floatToIntBits(valor) != Float.floatToIntBits(other.valor))
			return false;
		return true;
	} 
}
