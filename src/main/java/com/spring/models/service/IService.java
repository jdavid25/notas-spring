package com.spring.models.service;

import java.util.List;

import com.spring.models.entity.Estudiante;
import com.spring.models.entity.Materia;
import com.spring.models.entity.Nota;
import com.spring.models.entity.Semestre;

public interface IService {
	

	public List<Estudiante> findAllEst();
	public Estudiante findByIdEst(Long id);

	public List<Semestre> findAllSem();
	public Semestre findByIdSem(Long id);
	

	public List<Materia> findAllMat();
	public Materia findByIdMat(Long id);

	public List<Nota> findAllNota();
	public Nota findByIdNota(Long id);
	public Nota saveNota(Nota nota);
	public void deleteNota(Long id);
	public List<Nota> findByEstudiante(Long id);
}
