package com.serviunix.crimen.repository;

import com.serviunix.crimen.model.Invitado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvitadosRepository extends JpaRepository<Invitado, Integer> {

    Invitado findByNombre(String nombre);
    
}
