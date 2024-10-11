package com.salesianostriana.dam.ejerciciodto.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Asignatura {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private int numHoras;

    private String contenidos;

    @ManyToOne
    private Curso curso;

}
