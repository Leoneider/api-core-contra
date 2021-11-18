package com.ceiba.reserva.consulta;

import com.ceiba.reserva.modelo.dto.DtoReserva;
import com.ceiba.reserva.puerto.dao.DaoReserva;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class ManejadorListarReservasPorFechaAndIdEscenario {

    private final DaoReserva daoReserva;

    public ManejadorListarReservasPorFechaAndIdEscenario(DaoReserva daoReserva){
        this.daoReserva = daoReserva;
    }

    public List<DtoReserva> ejecutar(Long id, Date fecha){ return this.daoReserva.listarPorFechaAndEscenarioId(id, fecha); }
}
