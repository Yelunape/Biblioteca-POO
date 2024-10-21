package com.ylunape.taller3.libro.mapper;

import com.ylunape.taller3.libro.dto.LibroDTO;
import com.ylunape.taller3.libro.model.Libro;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface LibroMapper {

    Libro LibroDTOsinid(LibroDTO libroDTO);
}
