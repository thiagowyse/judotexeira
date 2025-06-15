package com.projetojudo.judotexeira.core.usecases.impl;

import com.projetojudo.judotexeira.core.entities.Categoria;
import com.projetojudo.judotexeira.core.gateway.CategoriaGateway;
import com.projetojudo.judotexeira.core.usecases.CategoriaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class CategoriaUseCaseImpl implements CategoriaUseCase {
    private final CategoriaGateway gateway;

    @Override
    public Categoria salvar(Categoria categoria) {
        return gateway.salvar(categoria);
    }

    @Override
    public Optional<Categoria> buscarPorId(Long id) {
        return gateway.buscarPorId(id);
    }

    @Override
    public Optional<Categoria> buscarPorNome(String nome) {
        return gateway.buscarPorNome(nome);
    }

    @Override
    public List<Categoria> listarTodas() {
        return gateway.listarTodas();
    }

    @Override
    public void deletar(Long id) {
        gateway.deletar(id);
    }
}