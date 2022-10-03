package com.au3.estudiante.Servicio;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.au3.estudiante.Modelos.Usuario;
import com.au3.estudiante.crud.UsuarioCrud;

@Service
public class UsuarioImplementacion implements UsuarioServicio{

    
    @Autowired
    private UsuarioCrud usuariocrud;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> BuscarUsuarios() {
        return  (List<Usuario>) usuariocrud.findAll();
    }

    @Override
    @Transactional
    public void guardar(Usuario usuario) {
        usuariocrud.save(usuario);
        
    }

    @Override
    @Transactional
    public void eliminar(Usuario usuario) {
        usuariocrud.delete(usuario); 
        
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario buscarPorCedula(Usuario usuario) {
        return usuariocrud.findById(usuario.getCedula()).orElse(null);
    }
    
}
