package com.ceiba.usuario.adaptador.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.usuario.modelo.dto.DtoUsuario;
import org.springframework.jdbc.core.RowMapper;

public class MapeoUsuario implements RowMapper<DtoUsuario>, MapperResult {

    @Override
    public DtoUsuario mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Long id = resultSet.getLong("id");
        String documento = resultSet.getString("documento");
        String nombre = resultSet.getString("nombres");
        String apellidos = resultSet.getString("apellidos");
        String celular = resultSet.getString("celular");
        String email = resultSet.getString("email");
        LocalDate fechaNacimiento = extraerLocalDate(resultSet, "fecha_nacimiento");
        return new DtoUsuario(id, documento, nombre, apellidos, celular, email, fechaNacimiento);
    }

}
