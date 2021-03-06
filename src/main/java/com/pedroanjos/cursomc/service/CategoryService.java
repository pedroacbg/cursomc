package com.pedroanjos.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedroanjos.cursomc.entities.Category;
import com.pedroanjos.cursomc.repositories.CategoryRepository;
import com.pedroanjos.cursomc.service.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public Category findById(Long id){
		Optional<Category> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Category.class.getName()));
	}
}
