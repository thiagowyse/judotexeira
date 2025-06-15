package com.projetojudo.judotexeira.core.usecases;
import com.projetojudo.judotexeira.core.entities.PostBlog;

import java.util.List;
import java.util.Optional;

public interface PostBlogUseCase {
    PostBlog salvar(PostBlog post);
    Optional<PostBlog> buscarPorId(Long id);
    List<PostBlog> listarTodos();
    void deletar(Long id);
}
