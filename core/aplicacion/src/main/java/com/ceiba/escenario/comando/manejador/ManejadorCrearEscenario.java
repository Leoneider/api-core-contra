package com.ceiba.escenario.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.escenario.comando.ComandoEscenario;
import com.ceiba.escenario.comando.fabrica.FabricaEscenario;
import com.ceiba.escenario.modelo.entidad.Escenario;
import com.ceiba.escenario.servicio.ServicioCrearEscenario;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearEscenario implements ManejadorComandoRespuesta<ComandoEscenario, ComandoRespuesta<Long>> {

    private final FabricaEscenario fabricaEscenario;
    private final ServicioCrearEscenario servicioCrearEscenario;

    public ManejadorCrearEscenario(FabricaEscenario fabricaEscenario, ServicioCrearEscenario servicioCrearEscenario) {
        this.fabricaEscenario = fabricaEscenario;
        this.servicioCrearEscenario = servicioCrearEscenario;
    }

    public ComandoRespuesta<Long> ejecutar(ComandoEscenario comandoEscenario) {
        Escenario escenario = this.fabricaEscenario.crear(comandoEscenario);
        return new ComandoRespuesta<>(this.servicioCrearEscenario.ejecutar(escenario));
    }
}
