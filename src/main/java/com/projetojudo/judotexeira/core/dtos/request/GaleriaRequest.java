package com.projetojudo.judotexeira.core.dtos.request;

public record GaleriaRequest(
        String titulo,
        String tipo,
        String url,
        String descricao
) {}