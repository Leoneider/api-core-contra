package com.ceiba.escenario.consulta;

import com.ceiba.escenario.modelo.dto.DtoEscenario;
import com.ceiba.escenario.puerto.dao.DaoEscenario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarEscenarios {

    private final DaoEscenario daoEscenario;

    public ManejadorListarEscenarios(DaoEscenario daoEscenario){
        this.daoEscenario = daoEscenario;
    }

    public List<DtoEscenario> ejecutar(){ return this.daoEscenario.listar(); }
}
