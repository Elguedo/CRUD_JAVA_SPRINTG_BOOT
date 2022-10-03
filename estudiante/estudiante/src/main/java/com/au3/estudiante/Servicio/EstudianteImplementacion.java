package com.au3.estudiante.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.au3.estudiante.Modelos.Estudiante;
import com.au3.estudiante.crud.EstudianteCrud;

@Service
public class EstudianteImplementacion implements EstudianteServicio {

    @Autowired
    private EstudianteCrud estudiantecrud;

    @Override
    @Transactional(readOnly = true)
    public List<Estudiante> BuscarEstudiante() {
        return  (List<Estudiante>) estudiantecrud.findAll();
    }

    @Override
    public void guardar(Estudiante estudiante) {
        estudiantecrud.save(estudiante);
        
    }

    @Override
    public void eliminar(Estudiante estudiante) {
        estudiantecrud.delete(estudiante);
        
    }

    @Override
    public Estudiante buscarPorCedula(Estudiante estudiante) {
        return estudiantecrud.findById(estudiante.getId()).orElse(null);
    }
    
}
