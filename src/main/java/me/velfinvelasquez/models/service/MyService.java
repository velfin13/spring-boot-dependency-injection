package me.velfinvelasquez.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("MyServicioSimple")
@Primary
public class MyService implements Iservice{

	@Override
	public String operacion() {
		return "Ejecutando un proceso importante simple";
	}
}
