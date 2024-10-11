package com.salesianostriana.dam.ejerciciodto.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


public class MatriculaNotas {

    @Id
    @GeneratedValue
    private Long id;

    private double nota;
}
