package com.au3.estudiante.crud;

import org.springframework.data.repository.CrudRepository;

import com.au3.estudiante.Modelos.Usuario;

public interface UsuarioCrud extends CrudRepository<Usuario,Integer> {
    
}
