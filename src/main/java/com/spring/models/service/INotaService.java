package com.spring.models.service;

import java.util.List;


import com.spring.models.entity.Nota;

public interface INotaService {
	

	public List<Nota> findAll();
	public Nota findById(Long id);
	public Nota save(Nota nota);
	public void delete(Long id);
	
	public List<Nota> getNotasPorEst(Long id);
	public List<Nota> findByEstudiante(Long id);
}
