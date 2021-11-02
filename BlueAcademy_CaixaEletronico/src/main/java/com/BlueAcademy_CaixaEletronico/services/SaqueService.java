package com.BlueAcademy_CaixaEletronico.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BlueAcademy_CaixaEletronico.dto.SaqueDto;
import com.BlueAcademy_CaixaEletronico.entities.Saque;
import com.BlueAcademy_CaixaEletronico.factories.SaqueFactory;
import com.BlueAcademy_CaixaEletronico.forms.SaqueForm;
import com.BlueAcademy_CaixaEletronico.repositories.SaqueRepository;

@Service
public class SaqueService {
	
	@Autowired
	private SaqueRepository repository;
	
	@Autowired
	private ContarNotasService contarNotasService;
	
	public SaqueDto add(SaqueForm form) {
		
		SaqueForm formInternal = new SaqueForm();
		
		formInternal.valor = form.valor;
		
		contarNotasService.ContarNotas(formInternal);
		
		if  (formInternal.valor == 0)  {	
			form.notas = formInternal.notas;
			Saque saque = SaqueFactory.Create(form);
			repository.save(saque);		
			return SaqueFactory.Create(saque);
		}
		else 
		{  
			return SaqueFactory.Create(form.valor);
		}
		
		
	}

}
