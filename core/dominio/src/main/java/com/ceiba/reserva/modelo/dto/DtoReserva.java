package com.ceiba.reserva.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class DtoReserva {
    private Long id;
    private LocalDate fecha;
    private Byte hora;
    private String estado;
    private Long valor;
    private Long escenarioId;
    private Long usuarioId;
}
