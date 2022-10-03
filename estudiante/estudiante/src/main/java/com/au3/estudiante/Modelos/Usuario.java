package com.au3.estudiante.Modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data 
@Entity
@Table(name  = "usuarios") 
public class Usuario implements Serializable {
   
    private static final long serialVersionUID = 1L;

    @Id 
    private int cedula;
    private String clave;
    private String nombre;
    private String telefono;
    @Column(unique = true) 
    private String email;
    
}

