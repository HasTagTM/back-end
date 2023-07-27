package com.example.GoodFatherPizza_ultimate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.GoodFatherPizza_ultimate.models.IElementiConsumabili;

@Repository
public interface IMenuRepository extends CrudRepository<IElementiConsumabili, Long>{

	
}
