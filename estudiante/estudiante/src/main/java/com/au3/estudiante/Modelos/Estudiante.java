package com.au3.estudiante.Modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data 
@Entity
@Table(name  = "estudiantes") 
public class Estudiante  implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private int usuario_id;
    private String nombre;
    private String apellido;
    private String semestre;
    private String email;
    private String genero;
    private String telefono;
    private String programa;
    private String universidad;
}
