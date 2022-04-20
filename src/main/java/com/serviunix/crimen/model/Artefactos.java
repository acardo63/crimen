package com.serviunix.crimen.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "artefactos")
public class Artefactos {
    @Id
    private Integer id;
    private String nombre;
    private Integer medida;
    private Integer lugar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getMedida() {
        return medida;
    }

    public void setMedida(Integer medida) {
        this.medida = medida;
    }

    public Integer getLugar() {
        return lugar;
    }

    public void setLugar(Integer lugar) {
        this.lugar = lugar;
    }
}
