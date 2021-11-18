package com.ceiba.reserva.comando.manejador;

import com.ceiba.manejador.ManejadorComando;
import com.ceiba.reserva.comando.ComandoReserva;
import com.ceiba.reserva.comando.fabrica.FabricaReserva;
import com.ceiba.reserva.modelo.entidad.Reserva;
import com.ceiba.reserva.servicio.ServicioActualizarReserva;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarReserva implements ManejadorComando<ComandoReserva> {

    private final FabricaReserva fabricaReserva;
    private final ServicioActualizarReserva servicioActualizarReserva;

    public ManejadorActualizarReserva(FabricaReserva fabricaReserva, ServicioActualizarReserva servicioActualizarReserva) {
        this.fabricaReserva = fabricaReserva;
        this.servicioActualizarReserva = servicioActualizarReserva;
    }

    public void ejecutar(ComandoReserva comandoReserva) {
        Reserva reserva = this.fabricaReserva.crear(comandoReserva);
        this.servicioActualizarReserva.ejecutar(reserva);
    }
}
