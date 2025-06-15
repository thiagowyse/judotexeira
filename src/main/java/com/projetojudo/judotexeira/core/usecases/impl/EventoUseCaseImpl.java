package com.projetojudo.judotexeira.core.usecases.impl;

import com.projetojudo.judotexeira.core.entities.Evento;
import com.projetojudo.judotexeira.core.gateway.EventoGateway;
import com.projetojudo.judotexeira.core.usecases.EventoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class EventoUseCaseImpl implements EventoUseCase {
    private final EventoGateway gateway;

    @Override
    public Evento salvar(Evento evento) {
        return gateway.salvar(evento);
    }

    @Override
    public Optional<Evento> buscarPorId(Long id) {
        return gateway.buscarPorId(id);
    }

    @Override
    public List<Evento> listarTodos() {
        return gateway.listarTodos();
    }

    @Override
    public void deletar(Long id) {
        gateway.deletar(id);
    }
}
