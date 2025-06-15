package com.projetojudo.judotexeira.core.gateway;

import com.projetojudo.judotexeira.core.entities.PostCategoria;

import java.util.List;

public interface PostCategoriaGateway {
    PostCategoria salvar(PostCategoria postCategoria);
    List<PostCategoria> listarPorPostId(Long idPost);
    void deletarPorPostId(Long idPost);

    List<PostCategoria> listarTodos();
}
