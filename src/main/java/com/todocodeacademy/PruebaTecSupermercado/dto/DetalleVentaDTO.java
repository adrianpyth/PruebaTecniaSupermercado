package com.todocodeacademy.PruebaTecSupermercado.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetalleVentaDTO {

    private Long id;
    private String nombreProd;
    private Integer cantProd;
    private Double precio;
    //campo calculado
    private Double subtotal;


}
