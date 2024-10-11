package com.salesianostriana.dam.ejerciciodto.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    @Enumerated(EnumType.STRING)
    private TipoCurso tipo;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Builder.Default
    @OneToMany(
            mappedBy="curso",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Asignatura> asignaturas = new ArrayList<>();


    // MÉTODOS HELPER --------------------------------------------------------

    public void addAsignatura(Asignatura a) {
        a.setCurso(this);
        this.asignaturas.add(a);
    }

    public void removeAsignatura(Asignatura a) {
        a.setCurso(null);
        this.asignaturas.remove(a);


    }

}
