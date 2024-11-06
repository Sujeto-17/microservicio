package com.msvc.calificacion.service.impl;

import com.msvc.calificacion.entity.Calificacion;
import com.msvc.calificacion.repository.CalificacionRepository;
import com.msvc.calificacion.service.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalificacionServiceImpl implements CalificacionService {

    @Autowired
    private CalificacionRepository calificacionRepository;

    //GUARDAR CALIFICACION
    @Override
    public Calificacion create(Calificacion calificacion) {
        return calificacionRepository.save(calificacion);
    }

    //LISTAR CALIFICACIONES
    @Override
    public List<Calificacion> getCalificaciones() {
        return calificacionRepository.findAll();
    }

    //LISTAR CALIFICACIONES POR USUARIO
    @Override
    public List<Calificacion> getCalificacionesByUsuarioId(String usuarioId) {
        return calificacionRepository.findByUsuarioId(usuarioId);
    }

    //LISTAR CALIFICACIONES POR HOTELES
    @Override
    public List<Calificacion> getCalificacionesByHotelId(String hotelId) {
        return calificacionRepository.findByHotelId(hotelId);
    }
}
