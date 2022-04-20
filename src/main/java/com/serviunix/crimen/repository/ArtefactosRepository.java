package com.serviunix.crimen.repository;

import com.serviunix.crimen.model.Artefactos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtefactosRepository extends JpaRepository<Artefactos, Integer> {

    Artefactos findByNombre(String nombre);
}
