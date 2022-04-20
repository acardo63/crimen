package com.serviunix.crimen.controller;

import com.serviunix.crimen.model.Invitado;
import com.serviunix.crimen.service.InvitadosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/invitados")
public class InvitadosController {

    private final InvitadosService invitadosService;

    public InvitadosController(InvitadosService invitadosService) {
        this.invitadosService = invitadosService;
    }

    @GetMapping(path = "{nombre}")
    public Invitado getInvitadoByName(@PathVariable("nombre") String nombre) {
        return invitadosService.getInvitadoByName(nombre);
    }

    @GetMapping(path = "list")
    public List<Invitado> getAll() {
        return invitadosService.getAll();
    }

    @GetMapping(path = "some")
    public List<Invitado> getSome() {
        Invitado invitado = new Invitado();
        invitado.setEstatura(165);
        return invitadosService.getSome(invitado);
    }
}
