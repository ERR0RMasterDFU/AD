package com.salesianostriana.dam.monumentos.services;

import com.salesianostriana.dam.monumentos.models.Monumento;
import com.salesianostriana.dam.monumentos.repositories.MonumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonumentoService {

    @Autowired
    private MonumentoRepository repositorio;

    // OBTENER LISTA DE TODOS LOS MONUMENTOS - FindAll()
    public List<Monumento> obtenerListaMonumentos () {
        return repositorio.findAll();
    }

    // ENCONTRAR MONUMENTO POR ID - FindById()
    public Optional<Monumento> obtenerMonumentoPorId (long id) {
        return repositorio.findById(id);
    }

    // GUARDA O ACTUALIZA MONUMENTO - Save()
    public void actualizarMonumento (Monumento monumento) {
        repositorio.save(monumento);
    }

    // BORRAR MONUMENTO - DeleteById()
    public void borrarMonumentoPorId (long id) {
        repositorio.deleteById(id);
    }

}