package com.BlueAcademy_CaixaEletronico.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.BlueAcademy_CaixaEletronico.dto.SaqueDto;
import com.BlueAcademy_CaixaEletronico.entities.Saque;
import com.BlueAcademy_CaixaEletronico.factories.SaqueFactory;
import com.BlueAcademy_CaixaEletronico.forms.SaqueForm;
import com.BlueAcademy_CaixaEletronico.repositories.SaqueRepository;

@Service
public class SaqueService {
	
	@Autowired
	private SaqueRepository repository;
	
	public SaqueDto add(SaqueForm form) {
		
		int valor = form.valor;
		
		List<String> notas = new ArrayList<String>(); 
		
		while(valor >= 100) {
			notas.add("100");
			valor = valor - 100;
			System.out.println(valor);
		}
		while(valor >= 50) {
			notas.add("50");
			valor = valor - 50;
		}
		while(valor >= 20) {
			notas.add("20");
			valor = valor - 20;
		}
		while(valor >= 10) {
			notas.add("10");
			valor = valor - 10;
		}
		while(valor >= 5) {
			notas.add("5");
			valor = valor - 5;
		}
				
		if  (valor == 0)  {	
			System.out.println("to aqui 1");
			form.notas = notas;
			Saque saque = SaqueFactory.Create(form);
			repository.save(saque);		
			return SaqueFactory.Create(saque);
		}
		else 
		{  
			System.out.println("to aqui 2");
			return SaqueFactory.Create(form.valor);
		}
		
		
	}

}
