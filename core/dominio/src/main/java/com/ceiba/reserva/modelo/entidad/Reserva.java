package com.ceiba.reserva.modelo.entidad;


import lombok.Getter;

import java.time.LocalDate;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
public class Reserva {

    private static final String SE_DEBE_INGRESAR_LA_FECHA_CREACION = "Se debe ingresar la fecha de creación";
    private static final String SE_DEBE_INGRESAR_LA_HORA = "Se debe ingresar la hora";
    private static final String SE_DEBE_INGRESAR_EL_ESCENARIO = "Se debe ingresar el escenario";
    private static final String SE_DEBE_INGRESAR_EL_USUARIO = "Se debe ingresar el usuario";


    private Long id;

    private LocalDate fecha;
    private Byte hora;
    private String estado;
    private Integer valor;
    private Long escenarioId;
    private Long usuarioId;

    public Reserva(Long id, LocalDate fecha, Byte hora, String estado, Integer valor, Long escenarioId, Long usuarioId) {
        validarObligatorio(fecha, SE_DEBE_INGRESAR_LA_FECHA_CREACION);
        validarObligatorio(hora, SE_DEBE_INGRESAR_LA_HORA);
        validarObligatorio(escenarioId, SE_DEBE_INGRESAR_EL_ESCENARIO);
        validarObligatorio(usuarioId, SE_DEBE_INGRESAR_EL_USUARIO);

        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.valor = valor;
        this.escenarioId = escenarioId;
        this.usuarioId = usuarioId;
    }
}
