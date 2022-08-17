package com.diandra.lilibeth.pizzeria.service;

import java.util.List;

import com.diandra.lilibeth.pizzeria.model.Pizzeria;

public interface PizzeriaService {
	
	List<Pizzeria> listar();
	Pizzeria obtenerID(Integer id);
	void guardar(Pizzeria pizzeria);
	void eliminar(Integer id);
	void actualizar(Pizzeria pizzeria);
	void asignarpizza();

}
