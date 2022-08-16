package com.ceiba.configuracion;

import com.ceiba.escenario.puerto.repositorio.RepositorioEscenario;
import com.ceiba.escenario.servicio.ServicioActualizarEscenario;
import com.ceiba.escenario.servicio.ServicioCrearEscenario;
import com.ceiba.escenario.servicio.ServicioEliminarEscenario;
import com.ceiba.reserva.puerto.repositorio.RepositorioReserva;
import com.ceiba.reserva.servicio.ServicioActualizarReserva;
import com.ceiba.reserva.servicio.ServicioCrearReserva;
import com.ceiba.reserva.servicio.ServicioEliminarReserva;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;
import com.ceiba.usuario.servicio.ServicioActualizarUsuario;
import com.ceiba.usuario.servicio.ServicioCrearUsuario;
import com.ceiba.usuario.servicio.ServicioEliminarUsuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {

    @Bean
    public ServicioCrearUsuario servicioCrearUsuario(RepositorioUsuario repositorioUsuario) {
        return new ServicioCrearUsuario(repositorioUsuario);
    }


    @Bean
    public ServicioEliminarUsuario servicioEliminarUsuario(RepositorioUsuario repositorioUsuario) {
        return new ServicioEliminarUsuario(repositorioUsuario);
    }

    @Bean
    public ServicioActualizarUsuario servicioActualizarUsuario(RepositorioUsuario repositorioUsuario) {
        return new ServicioActualizarUsuario(repositorioUsuario);
    }

    @Bean
    public ServicioCrearEscenario servicioCrearEscenario(RepositorioEscenario repositorioEscenario) {
        return new ServicioCrearEscenario(repositorioEscenario);
    }

    @Bean
    public ServicioEliminarEscenario servicioEliminarEscenario(RepositorioEscenario repositorioEscenario) {
        return new ServicioEliminarEscenario(repositorioEscenario);
    }

    @Bean
    public ServicioActualizarEscenario servicioActualizarEscenario(RepositorioEscenario repositorioEscenario) {
        return new ServicioActualizarEscenario(repositorioEscenario);
    }

    @Bean
    public ServicioCrearReserva servicioCrearReserva(RepositorioReserva repositorioReserva) {
        return new ServicioCrearReserva(repositorioReserva);
    }

    @Bean
    public ServicioEliminarReserva servicioEliminarReserva(RepositorioReserva repositorioReserva) {
        return new ServicioEliminarReserva(repositorioReserva);
    }

    @Bean
    public ServicioActualizarReserva servicioActualizarReserva(RepositorioReserva repositorioReserva) {
        return new ServicioActualizarReserva(repositorioReserva);
    }


}
