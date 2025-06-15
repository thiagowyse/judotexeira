package com.projetojudo.judotexeira.core.dtos.response;
import java.time.LocalDateTime;

public record PostBlogResponse(
        Integer idPost,
        String titulo,
        String conteudo,
        Integer autorId,
        LocalDateTime dataPublicacao
) {}
