package com.projetojudo.judotexeira.core.usecases;

import com.projetojudo.judotexeira.core.entities.ParticipanteEvento;

import java.util.List;
import java.util.Optional;

public interface ParticipanteEventoUseCase {

    ParticipanteEvento salvar(ParticipanteEvento participante);
    Optional<ParticipanteEvento> buscarPorId(Long id);
    List<ParticipanteEvento> listarPorEvento(Long idEvento);
    List<ParticipanteEvento> listarTodos();

    void deletar(Long id);
}
