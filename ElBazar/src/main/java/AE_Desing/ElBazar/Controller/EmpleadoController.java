package AE_Desing.ElBazar.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/empleados")
@Controller
public class EmpleadoController {

	
	/*@Autowired
	public IntServiceEmpleados serviceEmpleados;

	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		model.addAttribute("usuarios", serviceEmpleados.obtenerEmpleados());
		return "empleados/listaEmpleados";
	}*/
}
