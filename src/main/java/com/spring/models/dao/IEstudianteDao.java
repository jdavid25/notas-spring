package com.spring.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring.models.entity.Estudiante;

public interface IEstudianteDao extends CrudRepository<Estudiante, Long>{
	
	@Query("select e from Estudiante e left join fetch e.notas n where e.id = ?1")
	public Estudiante fetchByIdWithNotas(Long id);
}
