package com.projetojudo.judotexeira.core.usecases.impl;

import com.projetojudo.judotexeira.core.entities.PostCategoria;
import com.projetojudo.judotexeira.core.gateway.PostCategoriaGateway;
import com.projetojudo.judotexeira.core.usecases.PostCategoriaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class PostCategoriaUseCaseImpl implements PostCategoriaUseCase {

    private final PostCategoriaGateway gateway;

    @Override
    public PostCategoria salvar(PostCategoria postCategoria) {
        return gateway.salvar(postCategoria);
    }

    @Override
    public List<PostCategoria> listarPorPostId(Long idPost) {
        return gateway.listarPorPostId(idPost);
    }

    @Override
    public List<PostCategoria> listarTodos() {
        return gateway.listarTodos();
    }

    @Override
    public void deletarPorPostId(Long idPost) {
        gateway.deletarPorPostId(idPost);
    }
}