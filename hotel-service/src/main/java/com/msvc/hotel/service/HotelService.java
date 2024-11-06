package com.msvc.hotel.service;

import com.msvc.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {

    //Crear hotel
    Hotel create(Hotel hotel);

    //Listar hoteles
    List<Hotel> getAll();

    //Consultar hotel por id
    Hotel get(String id);
}
