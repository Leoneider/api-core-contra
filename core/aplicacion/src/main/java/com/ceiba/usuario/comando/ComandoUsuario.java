package com.ceiba.usuario.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoUsuario{
    private Long id;
    private String documento;
    private String nombres;
    private String apellidos;
    private String celular;
    private String email;
    private LocalDate fechaNacimiento;
    private String password;
}
