package com.serviunix.crimen.repository;

import com.serviunix.crimen.model.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LugarRepository extends JpaRepository<Lugar, Integer> {
}
