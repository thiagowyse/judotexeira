package com.projetojudo.judotexeira.core.usecases;

import com.projetojudo.judotexeira.core.entities.PostCategoria;

import java.util.List;

public interface PostCategoriaUseCase {

    PostCategoria salvar(PostCategoria postCategoria);
    List<PostCategoria> listarPorPostId(Long idPost);
    List<PostCategoria> listarTodos();
    void deletarPorPostId(Long idPost);
}
