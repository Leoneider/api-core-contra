package com.ceiba.reserva.adaptador.dao;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.reserva.modelo.dto.DtoReserva;
import com.ceiba.reserva.puerto.dao.DaoReserva;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
class DaoReservaImpl implements DaoReserva {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace= "reserva", value="listar")
    private static String sqlListar;

    @SqlStatement(namespace= "reserva", value="listarPorEscenarioId")
    private static String sqlListarPorEscenarioId;

    @SqlStatement(namespace= "reserva", value="listarPorUsuarioId")
    private static String sqlListarPorUsuarioId;

    @SqlStatement(namespace= "reserva", value="listarPorFechaAndEscenarioId")
    private static String sqlListarPorFechaAndEscenarioId;

    public DaoReservaImpl(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public List<DtoReserva> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new MapeoReserva());
    }

    @Override
    public List<DtoReserva> listarPorEscenarioId(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListarPorEscenarioId,paramSource,  new MapeoReserva());
    }

    @Override
    public List<DtoReserva> listarPorFechaAndEscenarioId(Long id, Date fecha) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);
        paramSource.addValue("fecha", fecha);
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListarPorFechaAndEscenarioId,paramSource,  new MapeoReserva());
    }

    @Override
    public List<DtoReserva> listarPorUsuarioId(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListarPorUsuarioId,paramSource,  new MapeoReserva());
    }


}
