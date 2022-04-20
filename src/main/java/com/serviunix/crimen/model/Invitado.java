package com.serviunix.crimen.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "invitados")
public class Invitado {

    @Id
    private Integer id;
    private String nombre;
    private Integer estatura;
    @JsonIgnore
    @OneToMany(mappedBy = "bitacordaId.invitado", fetch = FetchType.EAGER)
    private List<Bitacora> bitacoras;

    public List<Bitacora> getBitacoras() {
        return bitacoras;
    }

    public void setBitacoras(List<Bitacora> bitacoras) {
        this.bitacoras = bitacoras;
    }

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

    public Integer getEstatura() {
        return estatura;
    }

    public void setEstatura(Integer estatura) {
        this.estatura = estatura;
    }
}
