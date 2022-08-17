package com.diandra.lilibeth.pizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.diandra.lilibeth.pizzeria.client.OpenFeignClient;
import com.diandra.lilibeth.pizzeria.dto.Pizza;
import com.diandra.lilibeth.pizzeria.model.PizzaPizzeria;
import com.diandra.lilibeth.pizzeria.model.PizzaPizzeriaFK;
import com.diandra.lilibeth.pizzeria.model.Pizzeria;
import com.diandra.lilibeth.pizzeria.repository.PizzaPizzeriaRepository;
import com.diandra.lilibeth.pizzeria.repository.PizzeriaRepository;

@Service
public class PizzeriaServiceImpl implements PizzeriaService {

	
	@Autowired
	private PizzeriaRepository repo;
	
	@Autowired
	private PizzaPizzeriaRepository repopizza;
	
	@Autowired
	private OpenFeignClient feign;
	
	@Override
	public List<Pizzeria> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Pizzeria obtenerID(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void guardar(Pizzeria pizzeria) {
		repo.save(null);

	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);

	}

	@Override
	public void actualizar(Pizzeria pizzeria) {
		repo.saveAndFlush(pizzeria);

	}

	@Override
	public void asignarpizza() {
		List<Pizza> listado = feign.listarpizzasSeleccionados();;
		PizzaPizzeriaFK fk = null;
		PizzaPizzeria pizzadetalle = null;
		
		for(Pizza pizzas  : listado) {
			
			fk = new PizzaPizzeriaFK();
			
			fk.setIdPizza(pizzas.getIdPizza());
			fk.setIdPizzeria(1);
			
			pizzadetalle = new PizzaPizzeria();
			pizzadetalle.setFk(fk);

		}
			
		repopizza.save(pizzadetalle);
		
		
	}
	

}
