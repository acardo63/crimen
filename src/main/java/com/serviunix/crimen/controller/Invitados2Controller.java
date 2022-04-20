package com.serviunix.crimen.controller;

import com.serviunix.crimen.model.Invitado;
import com.serviunix.crimen.service.Invitados2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/prueba")
public class Invitados2Controller {

    @Autowired
    private Invitados2Service service;

    @GetMapping
    public List<Invitado> obtenerInvitados() {
        return service.obtenerListaInvitados();
    }

}
