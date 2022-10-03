package com.au3.estudiante.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.au3.estudiante.Modelos.Usuario;
import com.au3.estudiante.Servicio.UsuarioServicio;


@Controller
public class UsuarioControlador {
  
    @Autowired
    private UsuarioServicio usuarioservicio;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/agregar")
   public String agregar(Usuario usuario, Model model){
       model.addAttribute("usuario", usuario);
       return "/agregar";
   }
    @PostMapping("/guardar")
    public String guardar(Usuario usuario) {
       usuarioservicio.guardar(usuario);
        return "redirect:/listar";
}
  
    @GetMapping("/editar/{cedula}")
    public String editar(Usuario usuario, Model model){
        usuario = usuarioservicio.buscarPorCedula(usuario);
        model.addAttribute("usuario", usuario);
        return "/agregar"; 
    }

    @GetMapping("/eliminar/{cedula}")
    public String eliminar(Usuario usuario){
         usuarioservicio.eliminar(usuario);
         return "redirect:/listar";
    }

    @RequestMapping("/listar")
    public String listar(Model model) {
        List<Usuario> usuarios = usuarioservicio.BuscarUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "listar";
    } 
}