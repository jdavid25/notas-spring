package com.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.models.entity.Estudiante;
import com.spring.models.service.IEstudianteService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/")
public class EstudianteController {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@GetMapping("/")
	public List<Estudiante> index(){
		return estudianteService.findAll();
	}
	
	@GetMapping("/{id}")
	public Estudiante show(@PathVariable Long id) {
		return estudianteService.findById(id);
	}
	
	@GetMapping("est/{id}")
	public Estudiante ver(@PathVariable Long id) {
		return estudianteService.fetchByIdWithNotas(id);
	}
}
