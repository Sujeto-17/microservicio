package com.msvc.hotel.controller;

import com.msvc.hotel.entity.Hotel;
import com.msvc.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hoteles")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    //Guardar registros
    @PostMapping
    public ResponseEntity<Hotel> guardarHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
    }

    //Listar hoteles
    @GetMapping
    public ResponseEntity<List<Hotel>> listarHoteles(){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.getAll());
    }

    //Obtener hotel mediante ID
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> obtenerHotel(@PathVariable String hotelId){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.get(hotelId));
    }
}
