package com.projetojudo.judotexeira.adapters.controller;

import com.projetojudo.judotexeira.core.entities.PostCategoria;
import com.projetojudo.judotexeira.core.usecases.PostCategoriaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postcategorias")
@RequiredArgsConstructor
public class PostCategoriaController {

    private final PostCategoriaUseCase postCategoriaUseCase;

    @PostMapping
    public ResponseEntity<PostCategoria> salvar(@RequestBody PostCategoria postCategoria) {
        PostCategoria salvo = postCategoriaUseCase.salvar(postCategoria);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<PostCategoria>> listarPostPorId(@PathVariable Long id) {
        List <PostCategoria> postCategorias = postCategoriaUseCase.listarPorPostId(id);
        return ResponseEntity.ok(postCategorias);

    }

    @GetMapping
    public ResponseEntity<List<PostCategoria>> listarTodos() {
        List<PostCategoria> categorias = postCategoriaUseCase.listarTodos();
        return ResponseEntity.ok(categorias);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        postCategoriaUseCase.deletarPorPostId(id);
        return ResponseEntity.noContent().build();
    }
}
