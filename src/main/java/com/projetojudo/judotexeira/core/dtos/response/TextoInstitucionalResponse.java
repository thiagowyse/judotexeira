package com.projetojudo.judotexeira.core.dtos.response;
import java.time.LocalDateTime;

public record TextoInstitucionalResponse(
        Integer idTexto,
        String tipo,
        String conteudo,
        LocalDateTime dataAtualizacao
) {}
