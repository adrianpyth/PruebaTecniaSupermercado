package com.todocodeacademy.PruebaTecSupermercado.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //IDENTITY ES PARA QUE VAYA UNO A UNO(SECUENCIAL)
    private Long id;
    private String nombre;
    private String categoria;
    private double precio;
    private int cantidad;

}
