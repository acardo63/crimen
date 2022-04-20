package com.serviunix.crimen.controller;

import com.serviunix.crimen.model.Bitacora;
import com.serviunix.crimen.service.BitacoraService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bitacora")
public class BitacoraController {
    private final BitacoraService bitacoraService;

    public BitacoraController(BitacoraService bitacoraService) {
        this.bitacoraService = bitacoraService;
    }

    @GetMapping(path = "list")
    public List<Bitacora> getAll() {
        return bitacoraService.getAll();
    }
}
