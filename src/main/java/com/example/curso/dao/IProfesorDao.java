package com.example.curso.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.curso.entity.Profesor;

public interface IProfesorDao extends CrudRepository<Profesor, Long>{

	List<Profesor> findAll();
}
