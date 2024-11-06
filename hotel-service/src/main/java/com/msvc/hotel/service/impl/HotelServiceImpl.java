package com.msvc.hotel.service.impl;

import com.msvc.hotel.entity.Hotel;
import com.msvc.hotel.exception.ResourceNotFoundException;
import com.msvc.hotel.repository.HotelRepository;
import com.msvc.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;


    //Crear hotel
    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    //Listar hoteles
    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    //Obtener hotel por id
    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel no encontrado con el ID: " + id));
    }
}
