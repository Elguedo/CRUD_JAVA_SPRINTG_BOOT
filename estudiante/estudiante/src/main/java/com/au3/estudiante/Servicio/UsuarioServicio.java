package com.au3.estudiante.Servicio;

import java.util.List;

import com.au3.estudiante.Modelos.Usuario;

public interface UsuarioServicio {
    
    public List<Usuario> BuscarUsuarios();
    public void guardar (Usuario usuario);
    public void eliminar (Usuario usuario);
    public Usuario buscarPorCedula(Usuario usuario);
}
