package com.msvc.usuario.service.impl;

import com.msvc.usuario.entity.Usuario;
import com.msvc.usuario.exception.ResourceNotFoundException;
import com.msvc.usuario.repository.UsuarioRepository;
import com.msvc.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //Guardar usuarios
    @Override
    public Usuario saveUsuario(Usuario usuario) {
        String randomUsuarioId = UUID.randomUUID().toString();
        usuario.setUsuarioId(randomUsuarioId);
        return usuarioRepository.save(usuario);
    }

    //Listar todos los usuarios
    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    //Obtener usuario por ID
    @Override
    public Usuario getUsuario(String usuarioId) {
        return usuarioRepository.findById(usuarioId).orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado con el ID: " + usuarioId));
    }
}
