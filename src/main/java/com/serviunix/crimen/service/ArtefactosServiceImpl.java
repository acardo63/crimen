package com.serviunix.crimen.service;

import com.serviunix.crimen.model.Artefactos;
import com.serviunix.crimen.repository.ArtefactosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtefactosServiceImpl implements ArtefactosService{

    private final ArtefactosRepository repository;

    public ArtefactosServiceImpl(ArtefactosRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Artefactos> obtenerTodos() {
        return repository.findAll();
    }

    @Override
    public Artefactos obtenerPorNombre(String nombre) {
        return repository.findByNombre(nombre);
    }
}
