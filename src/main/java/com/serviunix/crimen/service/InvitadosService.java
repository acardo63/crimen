package com.serviunix.crimen.service;

import com.serviunix.crimen.model.Invitado;

import java.util.List;

public interface InvitadosService {

    Invitado getInvitadoByName(String nombre);

    List<Invitado> getAll();

    List<Invitado> getSome(Invitado invitado);
}
