package br.com.infnet.tpWilliamFreire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.infnet.tpWilliamFreire.model.negocio.Setor;
import br.com.infnet.tpWilliamFreire.model.negocio.Usuario;
import br.com.infnet.tpWilliamFreire.model.service.SetorService;
import br.com.infnet.tpWilliamFreire.model.service.UsuarioService;

@Controller
@SessionAttributes("user")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private SetorService setorService;
	
	@RequestMapping(value = "/usuarios", method = RequestMethod.GET)
	public String obterLista(Model model) {

		model.addAttribute("listaUsuario", usuarioService.obterLista());

		return "usuario/lista";
	}

	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public String showDetalhe(Model model) {
		model.addAttribute("listaSetor", setorService.obterLista());
		
		return "usuario/detalhe";
	}

	@RequestMapping(value = "/usuario", method = RequestMethod.POST)
	public String incluir(Model model, Usuario usuario, Setor setor) {	
		usuarioService.incluir(usuario);
	
		return this.obterLista(model);
	}

	@RequestMapping(value = "/usuario/excluir/{id}", method = RequestMethod.GET)
	public String excluir(Model model, @PathVariable Integer id) {
		usuarioService.excluir(id);

		return this.obterLista(model);
	}
}
