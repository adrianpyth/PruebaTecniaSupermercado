package com.todocodeacademy.PruebaTecSupermercado.model;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetalleVenta {

    private Long id;

    //venta
    @ManyToOne // muchos detalles pueden estar asociados a una venta
    private  Venta venta;

    //Producto
    @ManyToOne  //muchos detalles van a estar asociados a un producto
    private Producto prod;
    private Integer cantProd;
    private Double precio;



}
