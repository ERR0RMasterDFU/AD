package com.salesianostriana.dam.monumentos.models;

@Data
@Entity
public class Monumento {

    /*Su ID (un número entero)
El código de país (según el código ISO 3166-1 alfa 2).
El nombre del país.
El nombre de la ciudad.
Su localización (latitud, longitud).
El nombre del monumento
Un descripción del mismo
La URL de una foto.*/

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
