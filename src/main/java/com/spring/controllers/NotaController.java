package com.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.models.entity.Estudiante;
import com.spring.models.entity.Nota;
import com.spring.models.service.INotaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/nota")
public class NotaController {

	@Autowired
	private INotaService notaService;
	
	@GetMapping("/todo")
	public List<Nota> all() {
		return notaService.findAll();
	}
	
	@GetMapping("/{id}")
	public List<Nota> show(@PathVariable Long id) {
		return notaService.getNotasPorEst(id);
	}
	
	@GetMapping("est/{id}")
	public List<Nota> getEst(@PathVariable Long id) {
		return notaService.findByEstudiante(id);
	}
	
}
