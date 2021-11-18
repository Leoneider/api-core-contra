package com.ceiba.escenario.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.escenario.modelo.entidad.Escenario;
import com.ceiba.escenario.puerto.repositorio.RepositorioEscenario;

public class ServicioActualizarEscenario {

    private static final String EL_ESCENARIO_NO_EXISTE_EN_EL_SISTEMA = "El escenario no existe en el sistema";

    private final RepositorioEscenario repositorioEscenario;

    public ServicioActualizarEscenario(RepositorioEscenario repositorioEscenario) {
        this.repositorioEscenario = repositorioEscenario;
    }

    public void ejecutar(Escenario escenario) {
        validarExistenciaPrevia(escenario);
        this.repositorioEscenario.actualizar(escenario);
    }

    private void validarExistenciaPrevia(Escenario escenario) {
        boolean existe = this.repositorioEscenario.existePorId(escenario.getId());
        if(!existe) {
            throw new ExcepcionDuplicidad(EL_ESCENARIO_NO_EXISTE_EN_EL_SISTEMA);
        }
    }
}
