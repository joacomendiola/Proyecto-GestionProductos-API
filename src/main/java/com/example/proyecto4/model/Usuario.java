package com.example.proyecto4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;

    //Getter y Setters
    public Long getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
