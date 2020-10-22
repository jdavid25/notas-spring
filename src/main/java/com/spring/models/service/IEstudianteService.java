package com.spring.models.service;

import java.util.List;

import com.spring.models.entity.Estudiante;

public interface IEstudianteService {
	
	public List<Estudiante> findAll();
	public Estudiante findById(Long id);
	//public Estudiante fetchByIdWithNota(Long id);
	public Estudiante fetchByIdWithNotas(Long id);

}
