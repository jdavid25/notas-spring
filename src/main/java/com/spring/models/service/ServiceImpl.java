package com.spring.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.models.dao.IEstudianteDao;
import com.spring.models.dao.IMateriaDao;
import com.spring.models.dao.INotaDao;
import com.spring.models.dao.ISemestreDao;
import com.spring.models.entity.Estudiante;
import com.spring.models.entity.Materia;
import com.spring.models.entity.Nota;
import com.spring.models.entity.Semestre;

public class ServiceImpl implements IService{

	@Autowired
	private INotaDao notaDao;
	@Autowired
	private IEstudianteDao estudianteDao;
	@Autowired
	private ISemestreDao semestreDao;
	@Autowired
	private IMateriaDao materiaDao;
	
	@Override
	public List<Estudiante> findAllEst() {
		// TODO Auto-generated method stub
		return (List<Estudiante>) estudianteDao.findAll();
	}

	@Override
	public Estudiante findByIdEst(Long id) {
		// TODO Auto-generated method stub
		return estudianteDao.findById(id).orElse(null);
	}

	@Override
	public List<Nota> findAllNota() {
		// TODO Auto-generated method stub
		return (List<Nota>) notaDao.findAll();
	}

	@Override
	public Nota findByIdNota(Long id) {
		// TODO Auto-generated method stub
		return notaDao.findById(id).orElse(null);
	}

	@Override
	public Nota saveNota(Nota nota) {
		// TODO Auto-generated method stub
		return notaDao.save(nota);
	}

	@Override
	public void deleteNota(Long id) {
		// TODO Auto-generated method stub
		notaDao.deleteById(id);
	}

	@Override
	public List<Semestre> findAllSem() {
		// TODO Auto-generated method stub
		return (List<Semestre>) semestreDao.findAll();
	}

	@Override
	public Semestre findByIdSem(Long id) {
		// TODO Auto-generated method stub
		return semestreDao.findById(id).orElse(null);
	}

	@Override
	public List<Materia> findAllMat() {
		// TODO Auto-generated method stub
		return (List<Materia>) materiaDao.findAll();
	}

	@Override
	public Materia findByIdMat(Long id) {
		// TODO Auto-generated method stub
		return materiaDao.findById(id).orElse(null);
	}

	@Override
	public List<Nota> findByEstudiante(Long id) {
		// TODO Auto-generated method stub
		return notaDao.getNotaPorEst(id);
	}

}
