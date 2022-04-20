package com.serviunix.crimen.service;

import com.serviunix.crimen.model.Invitado;
import com.serviunix.crimen.repository.InvitadosRepository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvitadosServiceImpl implements InvitadosService {

    private final InvitadosRepository invitados;

    public InvitadosServiceImpl(InvitadosRepository invitados) {
        this.invitados = invitados;
    }

    @Override
    public Invitado getInvitadoByName(String nombre) {
        return invitados.findByNombre(nombre);
    }

    @Override
    public List<Invitado> getAll() {
        return invitados.findAll();
    }

    @Override
    public List<Invitado> getSome(Invitado invitado) {
        return invitados.findAll(Example.of(invitado));
    }
}
