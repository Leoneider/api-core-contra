package com.ceiba.escenario.adaptador.repositorio;

import com.ceiba.escenario.modelo.entidad.Escenario;
import com.ceiba.escenario.puerto.repositorio.RepositorioEscenario;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioEscenarioImpl implements RepositorioEscenario {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace= "escenario", value="crear")
    private static String sqlCrear;

    @SqlStatement(namespace= "escenario", value="actualizar")
    private static String sqlActualizar;

    @SqlStatement(namespace= "escenario", value="eliminar")
    private static String sqlEliminar;

    @SqlStatement(namespace= "escenario", value="existe")
    private static String sqlExiste;

    @SqlStatement(namespace= "escenario", value="existePorId")
    private static String sqlExistePorId;

    public RepositorioEscenarioImpl(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }


    @Override
    public Long crear(Escenario escenario) {
        return this.customNamedParameterJdbcTemplate.crear(escenario, sqlCrear);
    }

    @Override
    public void actualizar(Escenario escenario) {
        this.customNamedParameterJdbcTemplate.actualizar(escenario, sqlActualizar);
    }

    @Override
    public void eliminar(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);

        this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().update(sqlEliminar, paramSource);
    }

    @Override
    public boolean existe(String nombre) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("nombre", nombre);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExiste,paramSource, Boolean.class);
    }



    @Override
    public boolean existePorId(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExistePorId,paramSource, Boolean.class);
    }
}
