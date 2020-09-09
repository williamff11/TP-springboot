package br.com.infnet.tpWilliamFreire.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.tpWilliamFreire.model.negocio.Usuario;
import br.com.infnet.tpWilliamFreire.model.repository.IUsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private IUsuarioRepository usuarioRepository;

	public boolean isValid(String login, String senha) {
		return usuarioRepository.autenticacao(login, senha) != null;
	}
	
	public List<Usuario> obterLista() {
		return (List<Usuario>)usuarioRepository.findAll();
	}

	public Usuario userExist(String login) {
		return usuarioRepository.findByLogin(login);
	}

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}
}
