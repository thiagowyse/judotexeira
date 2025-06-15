package com.projetojudo.judotexeira.core.entities;

import java.time.LocalDateTime;

public record TextoInstitucional(
        Long idTexto,
        String tipo,
        String conteudo,
        LocalDateTime dataAtualizacao
) {}
