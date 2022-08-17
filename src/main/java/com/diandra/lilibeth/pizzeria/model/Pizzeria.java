package com.diandra.lilibeth.pizzeria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "pizzeria")
public class Pizzeria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPizzeria;
	private String direccion;
	private String sede;
	
	

}
