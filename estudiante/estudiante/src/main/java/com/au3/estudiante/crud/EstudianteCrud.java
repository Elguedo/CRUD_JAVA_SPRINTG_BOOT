package com.au3.estudiante.crud;

import org.springframework.data.repository.CrudRepository;

import com.au3.estudiante.Modelos.Estudiante;

public interface EstudianteCrud extends CrudRepository<Estudiante,Integer> {
    
}
