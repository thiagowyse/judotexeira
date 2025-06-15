package com.projetojudo.judotexeira.core.usecases.impl;

import com.projetojudo.judotexeira.core.entities.TextoInstitucional;
import com.projetojudo.judotexeira.core.gateway.TextoInstitucionalGateway;
import com.projetojudo.judotexeira.core.usecases.TextoInstitucionalUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class TextoInstitucionalUseCaseImpl implements TextoInstitucionalUseCase {
    private final TextoInstitucionalGateway gateway;

    @Override
    public TextoInstitucional salvar(TextoInstitucional texto) {
        return gateway.salvar(texto);
    }

    @Override
    public Optional<TextoInstitucional> buscarPorTipo(String tipo) {
        return gateway.buscarPorTipo(tipo);
    }

    @Override
    public List<TextoInstitucional> listarTodos() {
        return gateway.listarTodos();
    }

    @Override
    public void deletar(Long id) {
        gateway.deletar(id);
    }
}
