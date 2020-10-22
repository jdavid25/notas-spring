package com.spring.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.models.entity.Nota;

@Repository
public interface INotaDao extends CrudRepository<Nota, Long>{


	@Query("select n from Nota n where n.estudiante = ?1")
	//@Query(value = "SELECT * FROM NOTAS WHERE estudiante_id = ?1", nativeQuery = true)
	public List<Nota> getNotaPorEst(Long id);
	public List<Nota> findByEstudiante(Long id);
}
