package com.projetojudo.judotexeira.core.dtos.request;

public record ParticipanteEventoRequest(
        String nome,
        String email,
        String telefone,
        Integer idEvento
) {}
