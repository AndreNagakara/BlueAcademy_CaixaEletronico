package com.BlueAcademy_CaixaEletronico.forms;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class SaqueForm {
	
	@NotNull @NotEmpty @NotBlank
	public int valor;
	
	public List<String> notas;

}
