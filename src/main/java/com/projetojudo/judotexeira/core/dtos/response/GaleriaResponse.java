package com.projetojudo.judotexeira.core.dtos.response;
import java.time.LocalDateTime;

public record GaleriaResponse(
        Integer idItem,
        String titulo,
        String tipo,
        String url,
        String descricao,
        LocalDateTime dataUpload
) {}
