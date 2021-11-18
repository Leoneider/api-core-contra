package com.ceiba.reserva.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.reserva.modelo.entidad.Reserva;
import com.ceiba.reserva.puerto.repositorio.RepositorioReserva;


public class ServicioCrearReserva {

    private static final String YA_EXISTE_RESERVA_A_ESTA_HORA = "Ya existe una reserva en esta hora";

    private final RepositorioReserva repositorioReserva;

    public ServicioCrearReserva(RepositorioReserva repositorioReserva) {
        this.repositorioReserva = repositorioReserva;
    }

    public Long ejecutar(Reserva reserva) {
//        validarExistenciaPrevia(reserva);
        return this.repositorioReserva.crear(reserva);
    }

    private void validarExistenciaPrevia(Reserva reserva) {
        boolean existe = this.repositorioReserva.existe(reserva.getFecha(), reserva.getHora());
        if(existe) {
            throw new ExcepcionDuplicidad(YA_EXISTE_RESERVA_A_ESTA_HORA);
        }
    }
}
