package com.ceiba.escenario.adaptador.dao;

import com.ceiba.escenario.modelo.dto.DtoEscenario;
import com.ceiba.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeoEscenario implements RowMapper<DtoEscenario>, MapperResult {

    @Override
    public DtoEscenario mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Long id = resultSet.getLong("id");
        String nombre = resultSet.getString("nombre");
        String direccion = resultSet.getString("direccion");
        Integer valor = resultSet.getInt("valor");
        Byte horaInicial = resultSet.getByte("horainicial");
        Byte horaFinal = resultSet.getByte("horafinal");
        String imagen = resultSet.getString("imagen");
        return new DtoEscenario(id, nombre, direccion, valor,  horaInicial, horaFinal, imagen);
    }

}
