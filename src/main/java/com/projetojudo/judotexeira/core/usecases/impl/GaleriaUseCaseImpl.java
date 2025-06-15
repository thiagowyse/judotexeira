package com.projetojudo.judotexeira.core.usecases.impl;

import com.projetojudo.judotexeira.core.entities.Galeria;
import com.projetojudo.judotexeira.core.gateway.GaleriaGateway;
import com.projetojudo.judotexeira.core.usecases.GaleriaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class GaleriaUseCaseImpl implements GaleriaUseCase {
    private final GaleriaGateway gateway;

    @Override
    public Galeria salvar(Galeria galeria) {
        return gateway.salvar(galeria);
    }

    @Override
    public Optional<Galeria> buscarPorId(Long id) {
        return gateway.buscarPorId(id);
    }

    @Override
    public List<Galeria> listarTodos() {
        return gateway.listarTodos();
    }

    @Override
    public void deletar(Long id) {
        gateway.deletar(id);
    }
}