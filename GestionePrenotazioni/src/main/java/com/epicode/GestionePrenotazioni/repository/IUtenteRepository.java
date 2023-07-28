package com.epicode.GestionePrenotazioni.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.epicode.GestionePrenotazioni.models.Utente;

public interface IUtenteRepository extends JpaRepository<Utente, Long>{

	@Override
	default List<Utente> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends Utente> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default List<Utente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default List<Utente> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Page<Utente> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends Utente> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Optional<Utente> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	default boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	default long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	default void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void delete(Utente entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAll(Iterable<? extends Utente> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	default <S extends Utente> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	default <S extends Utente> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends Utente> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	default <S extends Utente> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	default <S extends Utente, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	default <S extends Utente> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends Utente> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default void deleteAllInBatch(Iterable<Utente> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	default Utente getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Utente getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Utente getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends Utente> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends Utente> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
