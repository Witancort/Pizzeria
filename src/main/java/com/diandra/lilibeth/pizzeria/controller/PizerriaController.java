package com.diandra.lilibeth.pizzeria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.diandra.lilibeth.pizzeria.model.Pizzeria;
import com.diandra.lilibeth.pizzeria.repository.PizzeriaRepository;
import com.diandra.lilibeth.pizzeria.service.PizzeriaService;

@Controller
@RequestMapping("api/pizzeria/v1")
public class PizerriaController {
	
	@Autowired
	private PizzeriaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizzeria> listar(){
		return service.listar();
	}
	@GetMapping("/listar/{id}")
	public Pizzeria obtener(@PathVariable Integer id) {
		return service.obtenerID(id);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Pizzeria pizzeria) {
		service.guardar(pizzeria);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(Pizzeria pizzeria) {
		service.actualizar(pizzeria);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarClientePizza() {
		service.asignarpizza();
	}

}
