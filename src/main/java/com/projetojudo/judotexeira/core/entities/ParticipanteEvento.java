package com.projetojudo.judotexeira.core.entities;

public record ParticipanteEvento(
        Long idParticipante,
        String nome,
        String email,
        String telefone,
        Long idEvento
) {}
