package com.BlueAcademy_CaixaEletronico.repositories;

import org.springframework.stereotype.Repository;

import com.BlueAcademy_CaixaEletronico.entities.Saque;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SaqueRepository extends JpaRepository<Saque, UUID> {
		

}
