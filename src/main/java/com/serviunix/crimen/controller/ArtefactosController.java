package com.serviunix.crimen.controller;

import com.serviunix.crimen.model.Artefactos;
import com.serviunix.crimen.service.ArtefactosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/artefactos")
public class ArtefactosController {

    private final ArtefactosService service;

    public ArtefactosController(ArtefactosService service) {
        this.service = service;
    }

    @GetMapping(path = "list")
    public List<Artefactos> obtenerLista() {
        return service.obtenerTodos();
    }

    @GetMapping(path = "nombre")
    public Artefactos obtenerNombre() {
        return service.obtenerPorNombre("Florero");
    }
}
