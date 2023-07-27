package com.epicode.GodfathersPizza.repository;

import org.springframework.data.repository.CrudRepository;

import com.epicode.GodfathersPizza.classes.Ordine;

public interface IOrdineDAOrepository extends CrudRepository<Ordine, Long>{

	<S extends Ordine> Iterable<S> saveAll(Iterable<S> entities);

}
