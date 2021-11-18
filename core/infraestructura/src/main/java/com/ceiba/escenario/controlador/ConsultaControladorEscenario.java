package com.ceiba.escenario.controlador;

import com.ceiba.escenario.consulta.ManejadorListarEscenarios;
import com.ceiba.escenario.consulta.ManejadorListarEscenariosPorNombre;
import com.ceiba.escenario.modelo.dto.DtoEscenario;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escenarios")
@Api(tags={"Controlador consulta escenario"})
public class ConsultaControladorEscenario {

    private final ManejadorListarEscenarios manejadorListarEscenarios;
    private final ManejadorListarEscenariosPorNombre manejadorListarEscenariosPorNombre;

    public ConsultaControladorEscenario(ManejadorListarEscenarios manejadorListarEscenarios, ManejadorListarEscenariosPorNombre manejadorListarEscenariosPorNombre) {
        this.manejadorListarEscenarios = manejadorListarEscenarios;
        this.manejadorListarEscenariosPorNombre = manejadorListarEscenariosPorNombre;
    }

    @GetMapping
    @ApiOperation("Listar escenarios")
    public List<DtoEscenario> listar() {
        return this.manejadorListarEscenarios.ejecutar();
    }

    @GetMapping("/buscar/{filter}")
    @ApiOperation("Listar escenarios por nombre")
    public List<DtoEscenario> listarEscenariosPorNombre(@PathVariable String filter) {
        return this.manejadorListarEscenariosPorNombre.ejecutar(filter);
    }






}
