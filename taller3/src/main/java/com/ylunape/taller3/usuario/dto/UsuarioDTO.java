package com.ylunape.taller3.usuario.dto;

import com.ylunape.taller3.persona.dto.PersonaIdDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO {

    private PersonaIdDTO idPersona;
    private String rol;

}
