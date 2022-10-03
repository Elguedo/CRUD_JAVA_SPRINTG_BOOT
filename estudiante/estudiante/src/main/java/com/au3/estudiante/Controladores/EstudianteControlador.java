package com.au3.estudiante.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.au3.estudiante.Modelos.Estudiante;
import com.au3.estudiante.Servicio.EstudianteServicio;


@Controller
public class EstudianteControlador {
    
    @Autowired
    private EstudianteServicio estudianteservicio;



    @GetMapping("/estudiante/agregare")
   public String agregar(Estudiante estudiante, Model model){
       model.addAttribute("estudiante", estudiante);
       return "/estudiante/agregare";
   }
    @PostMapping("/estudiante/guardare")
    public String guardar(Estudiante estudiante) {
        estudianteservicio.guardar(estudiante);
        return "redirect:/estudiante/listare";
}
  
    @GetMapping("/estudiante/editare/{id}")
    public String editar(Estudiante estudiante, Model model){
        estudiante = estudianteservicio.buscarPorCedula(estudiante);
        model.addAttribute("estudiante", estudiante);
        return "/estudiante/agregare"; 
    }

    @GetMapping("/estudiante/eliminare/{id}")
    public String eliminar(Estudiante estudiante){
        estudianteservicio.eliminar(estudiante);
         return "redirect:/estudiante/listare";
    }

    @RequestMapping("estudiante/listare")
    public String listar(Model model) {
        List<Estudiante> estudiantes = estudianteservicio.BuscarEstudiante();
        model.addAttribute("estudiantes", estudiantes);
        return "estudiante/listare";
    } 
}
