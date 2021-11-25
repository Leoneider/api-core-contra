package com.ceiba.escenario.puerto.dao;

import com.ceiba.escenario.modelo.dto.DtoEscenario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DaoEscenario {

    /**
     * Permite listar escenarios
     * @return los escenarios
     */
    Long count();
    Page<DtoEscenario> listar(Pageable pageable);
    List<DtoEscenario> listarPorNombre(String filter);
}
