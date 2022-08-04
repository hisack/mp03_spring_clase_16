package com.programacion;

import com.programacion.servicios.ServicioHolaMundo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HolaMundoRest {

    @Autowired
    private ServicioHolaMundo servicio;

    @GetMapping("/hola")
    public String hola(){

        return servicio.hola();

    }
}
