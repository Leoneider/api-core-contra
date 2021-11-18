package com.ceiba.escenario.puerto.dao;

import com.ceiba.escenario.modelo.dto.DtoEscenario;

import java.util.List;

public interface DaoEscenario {

    /**
     * Permite listar escenarios
     * @return los escenarios
     */
    List<DtoEscenario> listar();
    List<DtoEscenario> listarPorNombre(String filter);
}
