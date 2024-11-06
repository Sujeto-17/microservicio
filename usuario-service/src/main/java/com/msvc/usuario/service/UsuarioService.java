package com.msvc.usuario.service;

import com.msvc.usuario.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    //Guardar usuarios
    Usuario saveUsuario(Usuario usuario);

    //Listar todos los usuarios
    List<Usuario> getAllUsuarios();

    //Buscar usuario mediante ID
    Usuario getUsuario(String usuarioId);
}