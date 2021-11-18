package com.ceiba.escenario.adaptador.dao;

import com.ceiba.escenario.modelo.dto.DtoEscenario;
import com.ceiba.escenario.puerto.dao.DaoEscenario;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class DaoEscenarioImpl implements DaoEscenario {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace= "escenario", value="listar")
    private static String sqlListar;

    @SqlStatement(namespace= "escenario", value="listarPorNombre")
    private static String sqlListarPorNombre;

    public DaoEscenarioImpl(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public List<DtoEscenario> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new MapeoEscenario());
    }

    @Override
    public List<DtoEscenario> listarPorNombre(String filter) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("nombre", "%"+filter+"%");
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListarPorNombre, paramSource, new MapeoEscenario());
    }
}
