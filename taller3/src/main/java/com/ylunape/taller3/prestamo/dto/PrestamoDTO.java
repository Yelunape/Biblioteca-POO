package com.ylunape.taller3.prestamo.dto;

import com.ylunape.taller3.libro.dto.LibroIdDTO;
import com.ylunape.taller3.usuario.dto.UsuarioIdDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PrestamoDTO {

    private UsuarioIdDTO idUsuario;
    private LibroIdDTO idLibro;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private boolean prestado;

}
