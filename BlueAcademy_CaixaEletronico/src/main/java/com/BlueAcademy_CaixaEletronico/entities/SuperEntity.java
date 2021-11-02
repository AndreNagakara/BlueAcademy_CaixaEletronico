package com.BlueAcademy_CaixaEletronico.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class SuperEntity {

	@Id
	private UUID id;
	@SuppressWarnings("unused")
	private LocalDateTime createdAt;
	
	public SuperEntity() {
		id = UUID.randomUUID();
		var now = LocalDateTime.now();
		createdAt = now;
	}
	
	public UUID getId() {
		return id;
	}
	
}
