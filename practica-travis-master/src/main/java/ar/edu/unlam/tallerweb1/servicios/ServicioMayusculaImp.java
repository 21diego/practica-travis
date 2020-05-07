package ar.edu.unlam.tallerweb1.servicios;
import javax.inject.*;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("servicioMayuscula")
@Transactional
public class ServicioMayusculaImp implements ServicioMayuscula{

	@Override
	public String uppercase(String palabra) {
		return palabra.toUpperCase();
	}
	
}
