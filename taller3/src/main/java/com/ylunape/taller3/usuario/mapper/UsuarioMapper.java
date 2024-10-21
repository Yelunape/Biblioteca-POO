package com.ylunape.taller3.usuario.mapper;

import com.ylunape.taller3.usuario.dto.UsuarioDTO;
import com.ylunape.taller3.usuario.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "idPersona.nombre", ignore = true)
    @Mapping(target = "idPersona.apellido", ignore = true)
    @Mapping(target = "idPersona.sexo", ignore = true)
    Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO);

}
