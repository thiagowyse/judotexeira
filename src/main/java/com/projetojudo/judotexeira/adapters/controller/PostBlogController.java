package com.projetojudo.judotexeira.adapters.controller;

import com.projetojudo.judotexeira.core.entities.PostBlog;
import com.projetojudo.judotexeira.core.usecases.PostBlogUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/postsblog")
@RequiredArgsConstructor
public class PostBlogController {

    private final PostBlogUseCase postBlogUseCase;

    @PostMapping
    public ResponseEntity<PostBlog> salvar(@RequestBody PostBlog postBlog) {
        PostBlog salvo = postBlogUseCase.salvar(postBlog);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostBlog> buscarPorId(@PathVariable Long id) {
        Optional<PostBlog> post = postBlogUseCase.buscarPorId(id);
        return post.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<PostBlog>> listarTodos() {
        List<PostBlog> posts = postBlogUseCase.listarTodos();
        return ResponseEntity.ok(posts);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        postBlogUseCase.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
