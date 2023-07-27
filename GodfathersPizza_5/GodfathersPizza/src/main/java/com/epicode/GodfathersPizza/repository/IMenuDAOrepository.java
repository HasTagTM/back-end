package com.epicode.GodfathersPizza.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.epicode.GodfathersPizza.classes.Menu;


public interface IMenuDAOrepository extends CrudRepository<Menu, Long> {

    // Puoi aggiungere eventuali metodi personalizzati qui, se necessario

}
