package com.salesianostriana.dam.ejerciciodto.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @OneToMany(mappedBy="alumno", fetch = FetchType.EAGER)
    @Builder.Default
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<MatriculaNotas> matriculaNotas = new ArrayList<>();
}
