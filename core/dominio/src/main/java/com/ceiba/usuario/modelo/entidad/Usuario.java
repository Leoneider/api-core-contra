package com.ceiba.usuario.modelo.entidad;


import lombok.Getter;

import java.time.LocalDate;

import static com.ceiba.dominio.ValidadorArgumento.validarLongitud;
import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
public class Usuario {


    private static final String LA_CLAVE_DEBE_TENER_UNA_LONGITUD_MAYOR_O_IGUAL_A = "La clave debe tener una longitud mayor o igual a %s";
    private static final String SE_DEBE_INGRESAR_LA_CLAVE = "Se debe ingresar la clave";
    private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_USUARIO = "Se debe ingresar el nombre de usuario";
    private static final int LONGITUD_MINIMA_CLAVE = 4;

    private Long id;
    private String documento;
    private String nombres;
    private String apellidos;
    private String celular;
    private String email;
    private LocalDate fechaNacimiento;
    private String password;

    public Usuario(Long id, String documento, String nombres, String apellidos, String celular, String email, LocalDate fechaNacimiento, String password) {
        validarObligatorio(nombres, SE_DEBE_INGRESAR_EL_NOMBRE_DE_USUARIO);
        validarObligatorio(password, SE_DEBE_INGRESAR_LA_CLAVE);
        validarLongitud(password, LONGITUD_MINIMA_CLAVE, String.format(LA_CLAVE_DEBE_TENER_UNA_LONGITUD_MAYOR_O_IGUAL_A,LONGITUD_MINIMA_CLAVE));


        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.password = password;
    }

}
