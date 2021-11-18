package com.ceiba.escenario.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class DtoEscenario {
    private Long id;
    private String nombre;
    private String direccion;
    private Integer valor;
    private Byte horaInicial;
    private Byte horaFinal;
    private String imagen;
}
