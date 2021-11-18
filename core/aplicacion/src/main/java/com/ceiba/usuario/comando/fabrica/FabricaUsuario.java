package com.ceiba.usuario.comando.fabrica;

import com.ceiba.usuario.comando.ComandoUsuario;
import com.ceiba.usuario.modelo.entidad.Usuario;
import org.springframework.stereotype.Component;

@Component
public class FabricaUsuario {

    public Usuario crear(ComandoUsuario comandoUsuario) {
        return new Usuario(
                comandoUsuario.getId(),
                comandoUsuario.getDocumento(),
                comandoUsuario.getNombres(),
                comandoUsuario.getApellidos(),
                comandoUsuario.getCelular(),
                comandoUsuario.getEmail(),
                comandoUsuario.getFechaNacimiento(),
                comandoUsuario.getEmail()

        );
    }

}
