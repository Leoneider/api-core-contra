package com.ceiba.reserva.adaptador.dao;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.reserva.modelo.dto.DtoReserva;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class MapeoReserva implements RowMapper<DtoReserva>, MapperResult {

    @Override
    public DtoReserva mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Long id = resultSet.getLong("id");
        LocalDate fecha = extraerLocalDate(resultSet, "fecha");
        Byte hora = resultSet.getByte("hora");
        String estado = resultSet.getString("estado");
        Long valor = resultSet.getLong("valor");
        Long escenarioId = resultSet.getLong("escenario_id");
        Long usuarioId = resultSet.getLong("usuario_id");
        return new DtoReserva(id, fecha, hora, estado, valor, escenarioId, usuarioId);
    }

}
