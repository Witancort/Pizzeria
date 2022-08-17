package com.diandra.lilibeth.pizzeria.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class PizzaPizzeriaFK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8221704889304554902L;


	
	@Column(name="id_pizza",nullable = false, unique = true)
	private Integer idPizza;
	
	@Column(name = "id_pizzeria", nullable = false, unique = true)
	private Integer idPizzeria;
	
	
	
	

}
