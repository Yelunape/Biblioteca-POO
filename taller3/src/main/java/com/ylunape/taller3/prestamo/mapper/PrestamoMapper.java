package com.ylunape.taller3.prestamo.mapper;

import com.ylunape.taller3.prestamo.dto.PrestamoDTO;
import com.ylunape.taller3.prestamo.model.Prestamo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PrestamoMapper {


    @Mapping(target = "id", ignore = true)
    @Mapping(target = "idLibro.autor", ignore = true)
    @Mapping(target = "idLibro.isbn", ignore = true)
    @Mapping(target = "idLibro.titulo", ignore = true)
    @Mapping(target = "idUsuario.idPersona", ignore = true)
    @Mapping(target = "idUsuario.rol", ignore = true)
    Prestamo prestamoDTOToPrestamo(PrestamoDTO prestamoDTO);

}
