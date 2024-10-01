package com.salesianostriana.dam.monumentos.controllers;

import com.salesianostriana.dam.monumentos.models.Monumento;
import com.salesianostriana.dam.monumentos.services.MonumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("api/monumentos")
public class MonumentoController {

    @Autowired
    private MonumentoService service;


    //OBTENER LISTA MONUMENTOS

    @GetMapping
    public ResponseEntity<List<Monumento>> obtenerListaTodosMonumentos () {
        return new ResponseEntity<>(service.obtenerListaMonumentos(), HttpStatus.OK);
    }

    @PostMapping
    //EDITAR MONUMENTO
    public void editarMonumento (Monumento monumento) {

        service.actualizarMonumento(monumento);
    }

    @GetMapping("buscar/{id}")
    //BUSCAR MONUMENTO POR ID
    public ResponseEntity<Optional<Monumento>> obtenerMonumentoPorId (@PathVariable("id") long id) {
        return new ResponseEntity<>(service.obtenerMonumentoPorId(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    //BORRAR MONUMENTO POR ID
    public ResponseEntity<Void> borrarMonumento (@PathVariable("id") long id) {
        new ResponseEntity<>(service.borrarMonumentoPorId(id), HttpStatus.ACCEPTED);
    }

}