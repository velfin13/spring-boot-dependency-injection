package me.velfinvelasquez.models.service;

import org.springframework.stereotype.Service;

@Service("MyServicioComplejo")
public class MyServiceComplejo implements Iservice{

	@Override
	public String operacion() {
		return "Ejecutando un proceso importante Complejo";
	}
}
