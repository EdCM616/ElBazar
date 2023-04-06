package AE_Desing.ElBazar.Controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import AE_Desing.ElBazar.entity.Usuario;
import AE_Desing.ElBazar.services.IntServiceUsuario;


@RequestMapping("/usuarios")
@Controller
public class UsuariosController {

	@Autowired
	private IntServiceUsuario serviceUsuarios;
	
	
	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List<Usuario> lista = serviceUsuarios.obtenerUsuario();
		model.addAttribute("usuarios", lista);
		model.addAttribute("total", serviceUsuarios.totalUsuarios());
		for(Usuario u : lista) {
			System.out.println(u);
		}
		
		return "usuarios/listaUsuarios";
		
	}
	
	
	
	@GetMapping("/eliminar")
	public String eliminarCategoria(Usuario usuario, RedirectAttributes model) {
		if(usuario.getId() != null) {
			serviceUsuarios.eliminar(usuario.getId());
			model.addFlashAttribute("msg", "Usuario Eliminado");
		} 
		
		return "redirect:/usuarios/listaUusarios";
		
	}
}
