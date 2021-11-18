package com.ceiba.reserva.puerto.repositorio;

import com.ceiba.reserva.modelo.entidad.Reserva;

import java.time.LocalDate;

public interface RepositorioReserva {
    /**
     * Permite crear un reserva
     * @param reserva
     * @return el id generado
     */
    Long crear(Reserva reserva);

    /**
     * Permite actualizar un reserva
     * @param reserva
     */
    void actualizar(Reserva reserva);

    /**
     * Permite eliminar un reserva
     * @param id
     */
    void eliminar(Long id);

    /**
     * Permite validar si existe una reserva en la fecha
     * @param fecha
     * @return si existe o no
     */
    boolean existe(LocalDate fecha, Byte hora);

    /**
     * Permite validar si existe un reserva con un nombre excluyendo un id
     * @return si existe o no
     */
    boolean existePorId(Long id);

}
