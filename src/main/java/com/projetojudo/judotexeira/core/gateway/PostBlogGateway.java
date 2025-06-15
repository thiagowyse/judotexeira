package com.projetojudo.judotexeira.core.gateway;

import com.projetojudo.judotexeira.core.entities.PostBlog;

import java.util.List;
import java.util.Optional;

public interface PostBlogGateway {
    PostBlog salvar(PostBlog post);
    Optional<PostBlog> buscarPorId(Long id);
    List<PostBlog> listarTodos();
    void deletar(Long id);
}
