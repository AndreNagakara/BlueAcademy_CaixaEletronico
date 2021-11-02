package com.BlueAcademy_CaixaEletronico.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BlueAcademy_CaixaEletronico.dto.SaqueDto;
import com.BlueAcademy_CaixaEletronico.forms.SaqueForm;
import com.BlueAcademy_CaixaEletronico.services.SaqueService;


@RestController
public class SaqueController {
	
	@Autowired
	private SaqueService service;
	
	@PostMapping(value = "/Saque/{valor}")
	public ResponseEntity<SaqueDto> add(@PathVariable int valor) {
		SaqueForm form = new SaqueForm();
		form.valor = valor;
		var dto = service.add(form); 
		return ResponseEntity.ok(dto); 
	}
	
	

}
