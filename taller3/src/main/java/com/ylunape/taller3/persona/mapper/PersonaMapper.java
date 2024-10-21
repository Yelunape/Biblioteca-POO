package com.ylunape.taller3.persona.mapper;

import com.ylunape.taller3.persona.dto.PersonaDTO;
import com.ylunape.taller3.persona.model.Persona;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

    @Mapping(target = "id", ignore = true)
    Persona personaDTOToPersona(PersonaDTO personaDTO);

}
