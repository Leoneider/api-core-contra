package com.ceiba.escenario.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoEscenario {
    private Long id;
    private String nombre;
    private String direccion;
    private Integer valor;
    private Byte horaInicial;
    private Byte horaFinal;
    private String imagen;
}
