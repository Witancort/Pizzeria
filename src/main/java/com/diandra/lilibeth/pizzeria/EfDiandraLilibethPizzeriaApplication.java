package com.diandra.lilibeth.pizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
@EnableFeignClients
@SpringBootApplication
public class EfDiandraLilibethPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfDiandraLilibethPizzeriaApplication.class, args);
	}

}
