package com.ceiba.escenario.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.escenario.modelo.entidad.Escenario;
import com.ceiba.escenario.puerto.repositorio.RepositorioEscenario;

public class ServicioCrearEscenario {

    private static final String EL_USUARIO_YA_EXISTE_EN_EL_SISTEMA = "El usuario ya existe en el sistema";

    private final RepositorioEscenario repositorioEscenario;

    public ServicioCrearEscenario(RepositorioEscenario repositorioEscenario) {
        this.repositorioEscenario = repositorioEscenario;
    }

    public Long ejecutar(Escenario escenario) {
        validarExistenciaPrevia(escenario);
        return this.repositorioEscenario.crear(escenario);
    }

    private void validarExistenciaPrevia(Escenario escenario) {
        boolean existe = this.repositorioEscenario.existe(escenario.getNombre());
        if(existe) {
            throw new ExcepcionDuplicidad(EL_USUARIO_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}
