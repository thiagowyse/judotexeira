package com.projetojudo.judotexeira.core.dtos.request;
import java.time.LocalDateTime;

public record EventoRequest(
        String titulo,
        String descricao,
        LocalDateTime dataInicio,
        LocalDateTime dataFim,
        String local,
        Integer idOrganizador
) {}
