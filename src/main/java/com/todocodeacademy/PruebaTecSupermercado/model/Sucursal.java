package com.todocodeacademy.PruebaTecSupermercado.model;


//con lombok podemos ahorrarnos lo que es crear los getters y setters

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Sucursal {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String direccion;


    //mapeos que se hacen a cada clase: atributos, constrcutrores, getters and setters
}
