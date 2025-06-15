package com.projetojudo.judotexeira.core.entities;

import java.time.LocalDateTime;

public record Galeria(
        Long idItem,
        String titulo,
        String tipo,
        String url,
        String descricao,
        LocalDateTime dataUpload
) {}
