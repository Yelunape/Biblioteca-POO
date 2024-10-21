package com.ylunape.taller3.libro.repository;

import com.ylunape.taller3.libro.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

}
