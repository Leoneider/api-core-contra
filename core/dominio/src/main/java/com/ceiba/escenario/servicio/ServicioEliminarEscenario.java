package com.ceiba.escenario.servicio;

import com.ceiba.escenario.puerto.repositorio.RepositorioEscenario;

public class ServicioEliminarEscenario {

    private final RepositorioEscenario repositorioEscenario;

    public ServicioEliminarEscenario(RepositorioEscenario repositorioEscenario) {
        this.repositorioEscenario = repositorioEscenario;
    }

    public void ejecutar(Long id) {
        this.repositorioEscenario.eliminar(id);
    }
}
