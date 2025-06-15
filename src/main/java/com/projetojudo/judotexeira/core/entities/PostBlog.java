package com.projetojudo.judotexeira.core.entities;

import java.time.LocalDateTime;

public record PostBlog(
        Long idPost,
        String titulo,
        String conteudo,
        Long autorId,
        LocalDateTime dataPublicacao
) {}
