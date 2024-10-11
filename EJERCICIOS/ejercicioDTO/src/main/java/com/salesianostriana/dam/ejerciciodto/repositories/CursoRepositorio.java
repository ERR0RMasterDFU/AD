package com.salesianostriana.dam.ejerciciodto.repositories;

import com.salesianostriana.dam.ejerciciodto.models.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepositorio extends JpaRepository<Asignatura, Long> {
}
