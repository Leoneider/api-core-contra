package com.ceiba.escenario.consulta;

import com.ceiba.escenario.modelo.dto.DtoEscenario;
import com.ceiba.escenario.puerto.dao.DaoEscenario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarEscenariosPorNombre {

    private final DaoEscenario daoEscenario;

    public ManejadorListarEscenariosPorNombre(DaoEscenario daoEscenario){
        this.daoEscenario = daoEscenario;
    }

    public List<DtoEscenario> ejecutar(String filter){ return this.daoEscenario.listarPorNombre(filter); }
}
