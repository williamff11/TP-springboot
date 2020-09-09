package br.com.infnet.tpWilliamFreire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.infnet.tpWilliamFreire.model.negocio.Setor;
import br.com.infnet.tpWilliamFreire.model.service.SetorService;


@Controller
public class SetorController {

	@Autowired
	private SetorService setorService;
	
	
	@RequestMapping(value = "/setores", method = RequestMethod.GET)
	public String obterLista(Model model) {

		model.addAttribute("listaSetor", setorService.obterLista());

		return "setor/lista";
	}

	@RequestMapping(value = "/setor", method = RequestMethod.GET)
	public String showDetalhe() {
		return "setor/detalhe";
	}

	@RequestMapping(value = "/setor", method = RequestMethod.POST)
	public String incluir(Model model, Setor setor) {
		setorService.incluir(setor);

		return this.obterLista(model);
	}

	@RequestMapping(value = "/setor/excluir/{id}", method = RequestMethod.GET)
	public String excluir(Model model, @PathVariable Integer id) {
		setorService.excluir(id);

		return this.obterLista(model);
	}
}
