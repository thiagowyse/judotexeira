package com.projetojudo.judotexeira.core.gateway;

import com.projetojudo.judotexeira.core.entities.Evento;

import java.util.List;
import java.util.Optional;

public interface EventoGateway {
    Evento salvar(Evento evento);
    Optional<Evento> buscarPorId(Long id);
    List<Evento> listarTodos();
    void deletar(Long id);
}
