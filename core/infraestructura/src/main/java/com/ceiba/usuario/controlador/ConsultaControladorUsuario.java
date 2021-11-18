package com.ceiba.usuario.controlador;

import com.ceiba.usuario.consulta.ManejadorListarUsuarios;
import com.ceiba.usuario.consulta.ManejadorListarUsuariosPorDocumento;
import com.ceiba.usuario.modelo.dto.DtoUsuario;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
@Api(tags={"Controlador consulta usuario"})
public class ConsultaControladorUsuario {

    private final ManejadorListarUsuarios manejadorListarUsuarios;
    private final ManejadorListarUsuariosPorDocumento manejadorListarUsuariosPorDocumento;

    public ConsultaControladorUsuario(ManejadorListarUsuarios manejadorListarUsuarios, ManejadorListarUsuariosPorDocumento manejadorListarUsuariosPorDocumento) {
        this.manejadorListarUsuarios = manejadorListarUsuarios;
        this.manejadorListarUsuariosPorDocumento = manejadorListarUsuariosPorDocumento;
    }

    @GetMapping
    @ApiOperation("Listar Usuarios")
    public List<DtoUsuario> listar(@RequestParam Optional<String> documento) {
        System.out.println("Documento" + documento);
        if(documento.isPresent()){
            return this.manejadorListarUsuariosPorDocumento.ejecutar(documento.get());
        }
        return this.manejadorListarUsuarios.ejecutar();
    }

}
