package com.serviunix.crimen.model;

import javax.persistence.*;

@Entity
@Table(name = "bitacora")
public class Bitacora {

    @EmbeddedId
    private BitacordaId bitacordaId;

    public BitacordaId getBitacordaId() {
        return bitacordaId;
    }

    public void setBitacordaId(BitacordaId bitacordaId) {
        this.bitacordaId = bitacordaId;
    }
/*@ManyToOne(fetch = FetchType.EAGER)
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
    }*/
}