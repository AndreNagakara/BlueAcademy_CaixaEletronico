package com.BlueAcademy_CaixaEletronico.entities;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Saque extends SuperEntity{

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
