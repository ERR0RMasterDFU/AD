package com.salesianostriana.dam.ejerciciodto.repositories;

import com.salesianostriana.dam.ejerciciodto.models.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Asignatura, Long> {
}
