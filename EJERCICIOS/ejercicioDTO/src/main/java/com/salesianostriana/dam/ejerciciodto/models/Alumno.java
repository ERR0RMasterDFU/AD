package com.salesianostriana.dam.ejerciciodto.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private String apellidos;

    private String direccion;

    private String telefono;

    private String email;

    private Date fechaNac;
}
