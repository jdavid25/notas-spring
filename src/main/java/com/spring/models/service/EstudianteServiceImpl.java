package com.spring.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.models.dao.IEstudianteDao;
import com.spring.models.entity.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	@Autowired
	private IEstudianteDao estudianteDao;
	
	@Override
	public List<Estudiante> findAll() {
		// TODO Auto-generated method stub
		return (List<Estudiante>) estudianteDao.findAll();
	}

	@Override
	public Estudiante findById(Long id) {
		// TODO Auto-generated method stub
		return estudianteDao.findById(id).orElse(null);
	}

	@Override
	public Estudiante fetchByIdWithNotas(Long id) {
		// TODO Auto-generated method stub
		return estudianteDao.fetchByIdWithNotas(id);
	}

}
