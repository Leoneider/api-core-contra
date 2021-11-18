package com.ceiba.usuario.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class DtoUsuario {
    private Long id;
    private String documento;
    private String nombres;
    private String apellidos;
    private String celular;
    private String email;
    private LocalDate fechaNacimiento;
}
