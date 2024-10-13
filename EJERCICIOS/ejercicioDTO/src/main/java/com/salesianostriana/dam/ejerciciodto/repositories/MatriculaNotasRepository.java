package com.salesianostriana.dam.ejerciciodto.repositories;

import com.salesianostriana.dam.ejerciciodto.models.MatriculaNotas;
import com.salesianostriana.dam.ejerciciodto.models.MatriculaNotasPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaNotasRepository extends JpaRepository<MatriculaNotas, MatriculaNotasPK> {
}
