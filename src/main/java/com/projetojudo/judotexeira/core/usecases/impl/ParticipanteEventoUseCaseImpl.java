package com.projetojudo.judotexeira.core.usecases.impl;

import com.projetojudo.judotexeira.core.entities.ParticipanteEvento;
import com.projetojudo.judotexeira.core.gateway.ParticipanteEventoGateway;
import com.projetojudo.judotexeira.core.usecases.ParticipanteEventoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class ParticipanteEventoUseCaseImpl implements ParticipanteEventoUseCase {
    private final ParticipanteEventoGateway gateway;

    @Override
    public ParticipanteEvento salvar(ParticipanteEvento participante) {
        return gateway.salvar(participante);
    }

    @Override
    public Optional<ParticipanteEvento> buscarPorId(Long id) {
        return gateway.buscarPorId(id);
    }

    @Override
    public List<ParticipanteEvento> listarPorEvento(Long idEvento) {
        return gateway.listarPorEvento(idEvento);
    }

    @Override
    public List<ParticipanteEvento> listarTodos(){
        return gateway.listarTodos();
    }
    @Override
    public void deletar(Long id) {
        gateway.deletar(id);
    }
}
