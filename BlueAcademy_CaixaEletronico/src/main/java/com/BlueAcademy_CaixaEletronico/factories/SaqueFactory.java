package com.BlueAcademy_CaixaEletronico.factories;

import java.util.ArrayList;
import java.util.List;

import com.BlueAcademy_CaixaEletronico.dto.SaqueDto;
import com.BlueAcademy_CaixaEletronico.entities.Saque;
import com.BlueAcademy_CaixaEletronico.forms.SaqueForm;

public class SaqueFactory {
	
	public static Saque Create(SaqueForm form) {
		return new Saque (form.valor, form.notas);
	}
	
	
	public static SaqueDto Create(Saque saque) {
		var dto = new SaqueDto();
		System.out.println("to aqui 1");
		dto.Id = saque.getId();
		dto.Value = saque.getValor();
		dto.Notas = saque.getNotas();
		
		return dto;
	}
	
	public static SaqueDto Create(int valor) {
		var dto = new SaqueDto();
		
		System.out.println("to aqui 2");
		dto.Value = valor;
		
		List<String> temp = new ArrayList<String>();
		
		temp.add("valor inválido");
		
		dto.Notas= temp;
		
		return dto;
	}
 
}
