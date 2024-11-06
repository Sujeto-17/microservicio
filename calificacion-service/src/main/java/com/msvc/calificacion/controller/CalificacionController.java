package com.msvc.calificacion.controller;

import com.msvc.calificacion.entity.Calificacion;
import com.msvc.calificacion.service.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionController {

    @Autowired
    private CalificacionService calificacionService;

    //GUARDAR CALIFICACIONES
    @PostMapping
    public ResponseEntity<Calificacion> guardarCalificacion(@RequestBody Calificacion calificacion){
        return ResponseEntity.status(HttpStatus.CREATED).body(calificacionService.create(calificacion));
    }

    //LISTAR CALIFICACION
    @GetMapping
    public ResponseEntity<List<Calificacion>> listarCalificaciones(){
        return ResponseEntity.ok(calificacionService.getCalificaciones());
    }

    //LISTAR CALIFICACIONES POR USUARIO
    @GetMapping("/usuarios/{usuarioID}")
    public ResponseEntity<List<Calificacion>> listarCalificacionesPorUsuarioId(@PathVariable String usuarioID){
        return ResponseEntity.ok(calificacionService.getCalificacionesByUsuarioId(usuarioID));
    }

    //LISTAR CALIFICACIONES POR HOTEL
    @GetMapping("/hoteles/{hotelID}")
    public ResponseEntity<List<Calificacion>> listarCalificacionesPorHotelId(@PathVariable String hotelID){
        return ResponseEntity.ok(calificacionService.getCalificacionesByHotelId(hotelID));
    }
}
