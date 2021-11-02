package com.BlueAcademy_CaixaEletronico.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.BlueAcademy_CaixaEletronico.forms.SaqueForm;

@Service
public class ContarNotasService {
	
	public SaqueForm ContarNotas(SaqueForm internalForm) {
    
	int valor = internalForm.valor;
	
	List<String> notas = new ArrayList<String>(); 
	
	while(valor >= 100) {
		notas.add("100");
		valor = valor - 100;
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
	
	internalForm.valor = valor;
	internalForm.notas = notas;
	
	return internalForm;
	
	}
}
