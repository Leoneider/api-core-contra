package com.ceiba.escenario.controlador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.escenario.comando.ComandoEscenario;
import com.ceiba.escenario.comando.manejador.ManejadorActualizarEscenario;
import com.ceiba.escenario.comando.manejador.ManejadorCrearEscenario;
import com.ceiba.escenario.comando.manejador.ManejadorEliminarEscenario;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/escenarios")
@Api(tags = { "Controlador comando escenario"})
public class ComandoControladorEscenario {

    private final ManejadorCrearEscenario manejadorCrearEscenario;
	private final ManejadorEliminarEscenario manejadorEliminarEscenario;
	private final ManejadorActualizarEscenario manejadorActualizarEscenario;

    @Autowired
    public ComandoControladorEscenario(ManejadorCrearEscenario manejadorCrearEscenario,
									   ManejadorEliminarEscenario manejadorEliminarEscenario,
									   ManejadorActualizarEscenario manejadorActualizarEscenario) {
        this.manejadorCrearEscenario = manejadorCrearEscenario;
		this.manejadorEliminarEscenario = manejadorEliminarEscenario;
		this.manejadorActualizarEscenario = manejadorActualizarEscenario;
    }

    @PostMapping
    @ApiOperation("Crear Escenario")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoEscenario comandoEscenario) {
        return manejadorCrearEscenario.ejecutar(comandoEscenario);
    }

    @DeleteMapping(value="/{id}")
	@ApiOperation("Eliminar Escenario")
	public void eliminar(@PathVariable Long id) {
		manejadorEliminarEscenario.ejecutar(id);
	}

	@PutMapping(value="/{id}")
	@ApiOperation("Actualizar Escenario")
	public void actualizar(@RequestBody ComandoEscenario comandoEscenario,@PathVariable Long id) {
		comandoEscenario.setId(id);
		manejadorActualizarEscenario.ejecutar(comandoEscenario);
	}
}
