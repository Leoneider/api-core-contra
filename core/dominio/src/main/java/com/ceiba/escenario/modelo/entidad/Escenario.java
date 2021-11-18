package com.ceiba.escenario.modelo.entidad;


import lombok.Getter;

import static com.ceiba.dominio.ValidadorArgumento.*;

@Getter
public class Escenario {

    private static final String SE_DEBE_INGRESAR_EL_NOMBRE = "Se debe ingresar el nombre";
    private static final String SE_DEBE_INGRESAR_LA_DIRECCION = "Se debe ingresar la direccion";
    private static final String SE_DEBE_INGRESAR_EL_VALOR = "Se debe ingresar el valor";
    private static final String SE_DEBE_INGRESAR_LA_HORA_INICIAL = "Se debe ingresar la hora inicial";
    private static final String SE_DEBE_INGRESAR_LA_HORA_FINAL = "Se debe ingresar la hora final";
    private static final String SE_DEBE_INGRESAR_LA_IMAGEN= "Se debe ingresar una imagen";



    private Long id;
    private String nombre;
    private String direccion;
    private Integer valor;
    private Byte horaInicial;
    private Byte horaFinal;
    private String imagen;


    public Escenario(Long id, String nombre, String direccion, Integer valor, Byte horaInicial, Byte horaFinal, String imagen) {
        validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE);
        validarObligatorio(direccion, SE_DEBE_INGRESAR_LA_DIRECCION);
        validarObligatorio(valor, SE_DEBE_INGRESAR_EL_VALOR);
        validarObligatorio(horaInicial, SE_DEBE_INGRESAR_LA_HORA_INICIAL);
        validarObligatorio(horaFinal, SE_DEBE_INGRESAR_LA_HORA_FINAL);
        validarObligatorio(imagen, SE_DEBE_INGRESAR_LA_IMAGEN);

        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.valor = valor;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.imagen = imagen;
    }
}
