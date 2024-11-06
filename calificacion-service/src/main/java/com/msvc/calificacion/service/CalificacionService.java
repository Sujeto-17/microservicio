package com.msvc.calificacion.service;

import com.msvc.calificacion.entity.Calificacion;

import java.util.List;

public interface CalificacionService {

    // CREAR CALIFICACION
    Calificacion create(Calificacion calificacion);

    //LISTAR TODAS LAS CALIFICACIONES
    List<Calificacion> getCalificaciones();

    //LISTAR TODAS LAS CALIFICACIONES DE UN USUARIO POR ID
    List<Calificacion> getCalificacionesByUsuarioId(String usuarioId);

    //LISTAR TODAS LAS CALIFICACIONES DE UN HOTEL POR ID
    List<Calificacion> getCalificacionesByHotelId(String hotelId);
}
