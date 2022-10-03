package com.au3.estudiante.Servicio;

import java.util.List;

import com.au3.estudiante.Modelos.Estudiante;

public interface EstudianteServicio {
    
    public List<Estudiante> BuscarEstudiante();
    public void guardar (Estudiante estudiante);
    public void eliminar (Estudiante estudiante);
    public Estudiante buscarPorCedula(Estudiante estudiante);
}
