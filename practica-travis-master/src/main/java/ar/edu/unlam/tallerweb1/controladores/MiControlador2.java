package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MiControlador2 {

	@RequestMapping(value = {"/saludar2", "/saludar2/{nombre}/{apellido}"})
	public ModelAndView saludar(@PathVariable String nombre, @PathVariable String apellido) {
		ModelMap model = new ModelMap();
		model.put("mostrarNombre", nombre);
		model.put("mostrarApellido", apellido);
		return new ModelAndView("saludo2", model);
	}
}