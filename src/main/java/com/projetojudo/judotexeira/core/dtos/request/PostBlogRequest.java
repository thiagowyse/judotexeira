package com.projetojudo.judotexeira.core.dtos.request;

public record PostBlogRequest(
        String titulo,
        String conteudo,
        Integer autorId
) {}
