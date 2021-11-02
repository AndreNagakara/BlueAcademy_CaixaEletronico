package com.BlueAcademy_CaixaEletronico.entities;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Saque extends SuperEntity{

	@NotNull(message = "Valor de saque inválido")
	private int valor;
		
	@ElementCollection
    private List<String> notas;
	
	public Saque() {}
	
	public Saque(int valor, List<String> notas) {
		super();
		this.valor = valor;
		this.notas = notas;
	}
	
	public int getValor() {
		return valor;
	}
	
	public List<String> getNotas() {
		return notas;
	}
		
}
