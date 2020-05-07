package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.servicios.ServicioMayuscula;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ControladorMayuscula{
	private ServicioMayuscula servicioMayuscula;
	@Autowired
	public ControladorMayuscula(ServicioMayuscula servicioMayuscula) {
		this.servicioMayuscula = servicioMayuscula;
	}
	@RequestMapping(value = {"/mayuscula", "/mayuscula/{nombre}/{apellido}"})
	public ModelAndView mayuscula(@PathVariable String nombre, @PathVariable String apellido){
		ModelMap model = new ModelMap();
		model.put("nombreMayus", servicioMayuscula.uppercase(nombre));
		model.put("apellidoMayus", servicioMayuscula.uppercase(apellido));
		return new ModelAndView("mayuscula", model);
	}

}
