package com.ceiba.reserva.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoReserva {
    private Long id;
    private LocalDate fecha;
    private Byte hora;
    private String estado;
    private Integer valor;
    private Long escenarioId;
    private Long usuarioId;
}
