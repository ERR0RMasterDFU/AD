package com.salesianostriana.dam.monumentos.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Monumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombrePais;
    private String nombreCiudad;
    private String latitud;
    private String longitud;
    private String nombreMomunumento;

    @Lob
    private String descripcion;

    @Lob
    private String foto;
}
