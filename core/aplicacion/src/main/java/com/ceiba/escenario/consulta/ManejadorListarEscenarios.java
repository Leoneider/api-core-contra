package com.ceiba.escenario.consulta;

import com.ceiba.escenario.modelo.dto.DtoEscenario;
import com.ceiba.escenario.puerto.dao.DaoEscenario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class ManejadorListarEscenarios {

    private final DaoEscenario daoEscenario;

    public ManejadorListarEscenarios(DaoEscenario daoEscenario){
        this.daoEscenario = daoEscenario;
    }

    public Page<DtoEscenario> ejecutar(Pageable pageable){ return this.daoEscenario.listar(pageable); }

}
