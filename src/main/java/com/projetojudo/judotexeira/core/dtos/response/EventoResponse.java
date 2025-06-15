package com.projetojudo.judotexeira.core.dtos.response;
import java.time.LocalDateTime;

public record EventoResponse(
        Integer idEvento,
        String titulo,
        String descricao,
        LocalDateTime dataInicio,
        LocalDateTime dataFim,
        String local,
        Integer idOrganizador
) {}
