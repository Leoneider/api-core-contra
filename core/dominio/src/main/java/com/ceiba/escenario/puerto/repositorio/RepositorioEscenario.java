package com.ceiba.escenario.puerto.repositorio;

import com.ceiba.escenario.modelo.entidad.Escenario;

public interface RepositorioEscenario {
    /**
     * Permite crear un usuario
     * @param ecenario
     * @return el id generado
     */
    Long crear(Escenario ecenario);

    /**
     * Permite actualizar un usuario
     * @param ecenario
     */
    void actualizar(Escenario ecenario);

    /**
     * Permite eliminar un usuario
     * @param id
     */
    void eliminar(Long id);

    /**
     * Permite validar si existe un usuario con un nombre
     * @param nombre
     * @return si existe o no
     */
    boolean existe(String nombre);

    /**
     * Permite validar si existe un usuario con un nombre excluyendo un id
     * @return si existe o no
     */
    boolean existePorId(Long id);

}
