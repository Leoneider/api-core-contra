package com.ceiba.escenario.comando.fabrica;

import com.ceiba.escenario.comando.ComandoEscenario;
import com.ceiba.escenario.modelo.entidad.Escenario;
import org.springframework.stereotype.Component;

@Component
public class FabricaEscenario {

    public Escenario crear(ComandoEscenario comandoEscenario) {
        return new Escenario(
                comandoEscenario.getId(),
                comandoEscenario.getNombre(),
                comandoEscenario.getDireccion(),
                comandoEscenario.getValor(),
                comandoEscenario.getHoraInicial(),
                comandoEscenario.getHoraFinal(),
                comandoEscenario.getImagen()
        );
    }
}
