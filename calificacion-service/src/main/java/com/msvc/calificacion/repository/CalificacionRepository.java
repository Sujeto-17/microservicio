package com.msvc.calificacion.repository;

import com.msvc.calificacion.entity.Calificacion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CalificacionRepository extends MongoRepository<Calificacion, Long> {

    //LISTAR CALIFICACION POR USUARIO
    List<Calificacion> findByUsuarioId(String usuarioId);
    //LISTAR CALIFICACION POR HOTEL
    List<Calificacion> findByHotelId(String hotelId);
}
