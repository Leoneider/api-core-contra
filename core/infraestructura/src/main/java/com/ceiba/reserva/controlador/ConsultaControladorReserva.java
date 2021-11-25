package com.ceiba.reserva.controlador;

import com.ceiba.reserva.consulta.ManejadorListarReservas;
import com.ceiba.reserva.consulta.ManejadorListarReservasPorFechaAndIdEscenario;
import com.ceiba.reserva.consulta.ManejadorListarReservasPorIdEscenario;
import com.ceiba.reserva.consulta.ManejadorListarReservasPorIdUsuario;
import com.ceiba.reserva.modelo.dto.DtoReserva;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservas")
@Api(tags={"Controlador consulta reservas"})
public class ConsultaControladorReserva {

    private final ManejadorListarReservas manejadorListarReservas;
    private final ManejadorListarReservasPorIdEscenario manejadorListarReservasPorIdEscenario;
    private final ManejadorListarReservasPorFechaAndIdEscenario manejadorListarReservasPorFechaAndIdEscenario;
    private final ManejadorListarReservasPorIdUsuario manejadorListarReservasPorIdUsuario;


    public ConsultaControladorReserva(ManejadorListarReservasPorIdEscenario manejadorListarReservasPorIdEscenario,
                                      ManejadorListarReservas manejadorListarReservas,
                                      ManejadorListarReservasPorFechaAndIdEscenario manejadorListarReservasPorFechaAndIdEscenario,
                                      ManejadorListarReservasPorIdUsuario manejadorListarReservasPorIdUsuario) {
        this.manejadorListarReservasPorIdEscenario = manejadorListarReservasPorIdEscenario;
        this.manejadorListarReservas = manejadorListarReservas;
        this.manejadorListarReservasPorFechaAndIdEscenario = manejadorListarReservasPorFechaAndIdEscenario;
        this.manejadorListarReservasPorIdUsuario = manejadorListarReservasPorIdUsuario;
    }

    @GetMapping
    @ApiOperation("Listar Reservas")
    public List<DtoReserva> listar(@RequestParam Optional<Long> id, @RequestParam Optional<Date> fecha) {
        if(id.isPresent() && fecha.isPresent()){
            return this.manejadorListarReservasPorFechaAndIdEscenario.ejecutar(id.get(), fecha.get());
        }

        return this.manejadorListarReservas.ejecutar();
    }

    @GetMapping("/escenario/{id}")
    @ApiOperation("Listar reservas por escenario id")
    public List<DtoReserva> listarReservarPorEscenarioId(@PathVariable Long id) {
        return this.manejadorListarReservasPorIdEscenario.ejecutar(id);
    }

    @GetMapping("/escenario/{id}/fecha/{fecha}")
    @ApiOperation("Listar reservas por escenario id y fecha")
    public List<DtoReserva> listarReservarPorEscenarioIdAndFecha(@PathVariable Long id, @DateTimeFormat(pattern="yyyy-MM-dd") @PathVariable Date fecha) {
        return this.manejadorListarReservasPorFechaAndIdEscenario.ejecutar(id, fecha);
    }

    @GetMapping("/usuario/{id}")
    @ApiOperation("Listar reservas por usuario id")
    public List<DtoReserva> listarReservarPorUsuarioId(@PathVariable Long id) {
        return this.manejadorListarReservasPorIdUsuario.ejecutar(id);
    }


}
