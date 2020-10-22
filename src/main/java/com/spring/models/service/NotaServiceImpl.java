package com.spring.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.models.dao.INotaDao;
import com.spring.models.entity.Nota;

@Service
public class NotaServiceImpl implements INotaService{

	@Autowired
	private INotaDao notaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Nota> findAll() {
		// TODO Auto-generated method stub
		return (List<Nota>) notaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Nota findById(Long id) {
		// TODO Auto-generated method stub
		return notaDao.findById(id).orElse(null);
	}

	@Override
	public Nota save(Nota nota) {
		// TODO Auto-generated method stub
		return notaDao.save(nota);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		notaDao.deleteById(id);
	}

	@Override
	public List<Nota> getNotasPorEst(Long id) {
		// TODO Auto-generated method stub
		return notaDao.getNotaPorEst(id);
	}

	@Override
	public List<Nota> findByEstudiante(Long id) {
		// TODO Auto-generated method stub
		return notaDao.findByEstudiante(id);
	}


}
