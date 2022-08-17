package com.diandra.lilibeth.pizzeria.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pizza_pizzeria")
public class PizzaPizzeria {
	
	@Id
	private PizzaPizzeriaFK fk = new PizzaPizzeriaFK();
	
	
	

}