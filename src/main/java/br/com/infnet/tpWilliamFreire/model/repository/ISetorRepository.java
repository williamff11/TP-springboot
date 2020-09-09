package br.com.infnet.tpWilliamFreire.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.tpWilliamFreire.model.negocio.Setor;

@Repository
public interface ISetorRepository extends CrudRepository<Setor, Integer> {

	
}
