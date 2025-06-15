package com.projetojudo.judotexeira.core.usecases.impl;

import com.projetojudo.judotexeira.core.entities.Faq;
import com.projetojudo.judotexeira.core.gateway.FaqGateway;
import com.projetojudo.judotexeira.core.usecases.FaqUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class FaqUseCaseImpl implements FaqUseCase {
    private final FaqGateway gateway;

    @Override
    public Faq salvar(Faq faq) {
        return gateway.salvar(faq);
    }

    @Override
    public Optional<Faq> buscarPorId(Long id) {
        return gateway.buscarPorId(id);
    }

    @Override
    public List<Faq> listarTodos() {
        return gateway.listarTodos();
    }

    @Override
    public void deletar(Long id) {
        gateway.deletar(id);
    }
}