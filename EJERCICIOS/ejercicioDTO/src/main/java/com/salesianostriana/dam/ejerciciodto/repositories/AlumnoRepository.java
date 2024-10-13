package com.salesianostriana.dam.ejerciciodto.repositories;

import com.salesianostriana.dam.ejerciciodto.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
