package com.projetojudo.judotexeira.core.dtos.response;

public record ParticipanteEventoResponse(
        Integer idParticipante,
        String nome,
        String email,
        String telefone,
        Integer idEvento
) {}
