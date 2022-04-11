package com.pedroanjos.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedroanjos.cursomc.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{

}
