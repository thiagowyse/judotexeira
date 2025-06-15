package com.projetojudo.judotexeira.core.entities;

import java.time.LocalDateTime;

public record Faq(
        Long idFaq,
        String pergunta,
        String resposta,
        LocalDateTime dataAtualizacao
) {}
