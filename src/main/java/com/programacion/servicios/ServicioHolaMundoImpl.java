package com.programacion.servicios;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ServicioHolaMundoImpl implements ServicioHolaMundo {

    public String hola(){

        return "Hola " + LocalDateTime.now();
    }

}
