package com.salesianostriana.dam.ejerciciodto.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MatriculaNotas {

    @EmbeddedId
    private MatriculaNotasPK matriculaNotasPK = new MatriculaNotasPK();

    public MatriculaNotas(Asignatura as, Alumno a) {
        this.asignatura = as;
        this.alumno = a;
    }

    @Id
    @GeneratedValue
    private int anyo;

    private double nota;

    @ManyToOne
    @MapsId("alumno_id")
    @JoinColumn(name = "alumno_id")
    private Alumno alumno;

    @ManyToOne
    @MapsId("asignatura_id")
    @JoinColumn(name = "asignatura_id")
    private Asignatura asignatura;


    //MÉTODOS HELPER -------------------------------------------------------------------------------------------

    public void agregarAAlumno(Alumno a) {
        a.getMatriculaNotas().add(this);
        this.alumno = a;
    }

    public void quitarDeAlumno(Alumno a) {
        a.getMatriculaNotas().remove(this);
        this.alumno = null;
    }


}
