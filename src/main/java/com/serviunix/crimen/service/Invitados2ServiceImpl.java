package com.serviunix.crimen.service;

import com.serviunix.crimen.model.Invitado;
import com.serviunix.crimen.repository.InvitadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Invitados2ServiceImpl implements Invitados2Service {

    @Autowired
    private InvitadosRepository repository;

    @Override
    public List<Invitado> obtenerListaInvitados() {
        return repository.findAll();
    }
}
