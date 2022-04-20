package com.serviunix.crimen.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BitacordaId implements Serializable {

    private int hora;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "invitado")
    private Invitado invitado;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "lugar")
    private Lugar lugar;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Invitado getInvitado() {
        return invitado;
    }

    public void setInvitado(Invitado invitado) {
        this.invitado = invitado;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BitacordaId that = (BitacordaId) o;
        return hora == that.hora && invitado.equals(that.invitado) && lugar.equals(that.lugar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hora, invitado, lugar);
    }
}
