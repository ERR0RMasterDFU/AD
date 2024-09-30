package com.salesianostriana.dam.monumentos.controllers;

import com.salesianostriana.dam.monumentos.models.Monumento;
import com.salesianostriana.dam.monumentos.services.MonumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path ="api/v1/monumentos")
public class MonumentoController {

    @Autowired
    private MonumentoService service;


    //OBTENER LISTA MONUMENTOS

    @GetMapping
    public List<Monumento> obtenerListaTodosMonumentos () {
        return service.obtenerListaMonumentos();
    }

    @PostMapping
    //EDITAR MONUMENTO
    public void editarMonumento (Monumento monumento) {
        service.actualizarMonumento(monumento);
    }

    @GetMapping("buscar/{id}")
    //BUSCAR MONUMENTO POR ID
    public Optional<Monumento> obtenerMonumentoPorId (@PathVariable("id") int id) {
        return service.obtenerMonumentoPorId(id);
    }

    @DeleteMapping("/{id}")
    //BORRAR MONUMENTO POR ID
    public void borrarMonumento (@PathVariable("id") int id) {
        service.borrarMonumentoPorId(id);
    }

}