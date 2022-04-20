package com.serviunix.crimen.service;

import com.serviunix.crimen.model.Bitacora;
import com.serviunix.crimen.repository.BitacoraRepository;
import com.serviunix.crimen.repository.InvitadosRepository;
import com.serviunix.crimen.repository.LugarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BitacoraServiceImpl implements BitacoraService{

    private final BitacoraRepository repository;
    private final InvitadosRepository invitadosRepository;
    private final LugarRepository lugarRepository;

    public BitacoraServiceImpl(BitacoraRepository repository, InvitadosRepository invitadosRepository, LugarRepository lugarRepository) {
        this.repository = repository;
        this.invitadosRepository = invitadosRepository;
        this.lugarRepository = lugarRepository;
    }

    @Override
    public List<Bitacora> getAll() {
        //invitadosRepository.findAll();
        //lugarRepository.findAll();
        return repository.findAll();
    }
}
