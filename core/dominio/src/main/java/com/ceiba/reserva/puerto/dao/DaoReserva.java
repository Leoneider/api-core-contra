package com.ceiba.reserva.puerto.dao;

import com.ceiba.reserva.modelo.dto.DtoReserva;

import java.util.Date;
import java.util.List;

public interface DaoReserva {

    /**
     * Permite listar escenarios
     * @return los escenarios
     */
    List<DtoReserva> listar();
    List<DtoReserva> listarPorEscenarioId(Long id);
    List<DtoReserva> listarPorFechaAndEscenarioId(Long id, Date fecha);



}
