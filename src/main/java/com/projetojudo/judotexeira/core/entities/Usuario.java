package com.projetojudo.judotexeira.core.entities;

public record Usuario(
        Long idUsuario,
        String nome,
        String email,
        String senha,
        String role
) {}