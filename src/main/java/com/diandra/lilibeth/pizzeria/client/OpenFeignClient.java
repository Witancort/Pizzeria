package com.diandra.lilibeth.pizzeria.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.diandra.lilibeth.pizzeria.dto.Pizza;

@FeignClient(name="idat-pizza", url="localhost:8085")
public interface OpenFeignClient {
	
	@GetMapping("/api/estudiante/v1/listar")
	public List<Pizza> listarpizzasSeleccionados();

}
