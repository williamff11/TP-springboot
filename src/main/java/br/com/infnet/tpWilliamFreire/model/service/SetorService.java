package br.com.infnet.tpWilliamFreire.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.tpWilliamFreire.model.negocio.Setor;
import br.com.infnet.tpWilliamFreire.model.repository.ISetorRepository;

@Service
public class SetorService {

	@Autowired
	private ISetorRepository setorRepository;

	public List<Setor> obterLista() {
		return (List<Setor>)setorRepository.findAll();
	}

	public void incluir(Setor contato) {
		setorRepository.save(contato);
	}

	public void excluir(Integer id) {
		setorRepository.deleteById(id);
	}
}
