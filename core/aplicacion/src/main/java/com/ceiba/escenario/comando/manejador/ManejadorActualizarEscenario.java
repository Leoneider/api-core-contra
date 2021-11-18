package com.ceiba.escenario.comando.manejador;

import com.ceiba.escenario.comando.ComandoEscenario;
import com.ceiba.escenario.comando.fabrica.FabricaEscenario;
import com.ceiba.escenario.modelo.entidad.Escenario;
import com.ceiba.escenario.servicio.ServicioActualizarEscenario;
import com.ceiba.manejador.ManejadorComando;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarEscenario implements ManejadorComando<ComandoEscenario> {

    private final FabricaEscenario fabricaEscenario;
    private final ServicioActualizarEscenario servicioActualizarEscenario;

    public ManejadorActualizarEscenario(FabricaEscenario fabricaEscenario, ServicioActualizarEscenario servicioActualizarEscenario) {
        this.fabricaEscenario = fabricaEscenario;
        this.servicioActualizarEscenario = servicioActualizarEscenario;
    }

    public void ejecutar(ComandoEscenario comandoEscenario) {
        Escenario escenario = this.fabricaEscenario.crear(comandoEscenario);
        this.servicioActualizarEscenario.ejecutar(escenario);
    }
}
