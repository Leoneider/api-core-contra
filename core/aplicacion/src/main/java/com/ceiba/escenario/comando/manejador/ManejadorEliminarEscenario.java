package com.ceiba.escenario.comando.manejador;

import com.ceiba.escenario.servicio.ServicioEliminarEscenario;
import com.ceiba.manejador.ManejadorComando;
import org.springframework.stereotype.Component;


@Component
public class ManejadorEliminarEscenario implements ManejadorComando<Long> {

    private final ServicioEliminarEscenario servicioEliminarEscenario;

    public ManejadorEliminarEscenario(ServicioEliminarEscenario servicioEliminarEscenario) {
        this.servicioEliminarEscenario = servicioEliminarEscenario;
    }

    public void ejecutar(Long idEscenario) {
        this.servicioEliminarEscenario.ejecutar(idEscenario);
    }
}
