package com.projetojudo.judotexeira.core.usecases.impl;

import com.projetojudo.judotexeira.core.entities.PostBlog;
import com.projetojudo.judotexeira.core.gateway.PostBlogGateway;
import com.projetojudo.judotexeira.core.usecases.PostBlogUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class PostBlogUseCaseImpl implements PostBlogUseCase {

    private final PostBlogGateway gateway;

    @Override
    public PostBlog salvar(PostBlog postBlog) {
        return gateway.salvar(postBlog);
    }

    @Override
    public Optional<PostBlog> buscarPorId(Long id) {
        return gateway.buscarPorId(id);
    }

    @Override
    public List<PostBlog> listarTodos() {
        return gateway.listarTodos();
    }

    @Override
    public void deletar(Long id) {
        gateway.deletar(id);
    }
}