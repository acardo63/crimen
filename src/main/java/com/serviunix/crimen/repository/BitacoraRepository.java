package com.serviunix.crimen.repository;

import com.serviunix.crimen.model.Bitacora;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BitacoraRepository extends JpaRepository<Bitacora, UUID> {
}
