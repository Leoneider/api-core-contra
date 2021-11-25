package com.ceiba.escenario.adaptador.dao;

import com.ceiba.escenario.modelo.dto.DtoEscenario;
import com.ceiba.escenario.puerto.dao.DaoEscenario;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class DaoEscenarioImpl implements DaoEscenario {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace= "escenario", value="listar")
    private static String sqlListar;

    @SqlStatement(namespace= "escenario", value="count")
    private static String sqlCount;

    @SqlStatement(namespace= "escenario", value="listarPorNombre")
    private static String sqlListarPorNombre;

    public DaoEscenarioImpl(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    /**
     * Permite listar escenarios
     *
     * @return los escenarios
     */
    @Override
    public Long count() {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlCount, paramSource, Long.class);
    }

    @Override
    public Page<DtoEscenario> listar(Pageable page) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        System.out.println("PageSize "+ page.getPageSize() );
        System.out.println("OffSet "+page.getOffset() );
        paramSource.addValue("limit", page.getPageSize());
        paramSource.addValue("offSet", page.getOffset());
        System.out.println(count());
        List<DtoEscenario> escenarios = this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, paramSource, new MapeoEscenario());
        return new PageImpl<DtoEscenario>(escenarios, page, count());
    }

    @Override
    public List<DtoEscenario> listarPorNombre(String filter) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("nombre", "%"+filter+"%");
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListarPorNombre, paramSource, new MapeoEscenario());
    }
}
