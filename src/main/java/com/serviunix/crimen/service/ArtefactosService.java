package com.serviunix.crimen.service;

import com.serviunix.crimen.model.Artefactos;

import java.util.List;

public interface ArtefactosService {

    List<Artefactos> obtenerTodos();
    Artefactos obtenerPorNombre(String nombre);
}
