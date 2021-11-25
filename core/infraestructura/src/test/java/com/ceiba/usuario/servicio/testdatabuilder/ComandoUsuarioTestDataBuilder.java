package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.comando.ComandoUsuario;

import java.time.LocalDate;
import java.util.UUID;

public class ComandoUsuarioTestDataBuilder {

    private Long id;
    private String documento;
    private String nombres;
    private String apellidos;
    private String celular;
    private String email;
    private LocalDate fechaNacimiento;
    private String password;

    public ComandoUsuarioTestDataBuilder() {
        id = Long.getLong(UUID.randomUUID().toString()) ;
        documento = "1234";
        nombres = "Leo";
        apellidos = "Leo";
        celular = "Leo";
        email = "Leo";
        fechaNacimiento = LocalDate.now();
        password = "Leo";
    }

    public ComandoUsuarioTestDataBuilder conNombre(String nombre) {
        this.nombres = nombre;
        return this;
    }

    public ComandoUsuario build() {
        return new ComandoUsuario(id,documento, nombres, apellidos, celular, email, fechaNacimiento, password);
    }
}
