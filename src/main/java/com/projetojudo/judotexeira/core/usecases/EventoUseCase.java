package com.projetojudo.judotexeira.core.usecases;
import com.projetojudo.judotexeira.core.entities.Evento;

import java.util.List;
import java.util.Optional;

public interface EventoUseCase {
    Evento salvar(Evento evento);
    Optional<Evento> buscarPorId(Long id);
    List<Evento> listarTodos();
    void deletar(Long id);
}
