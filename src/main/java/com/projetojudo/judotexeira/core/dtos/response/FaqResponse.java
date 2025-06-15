package com.projetojudo.judotexeira.core.dtos.response;
import java.time.LocalDateTime;

public record FaqResponse(
        Integer idFaq,
        String pergunta,
        String resposta,
        LocalDateTime dataAtualizacao
) {}

