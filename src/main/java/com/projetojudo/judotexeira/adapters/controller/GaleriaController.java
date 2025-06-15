package com.projetojudo.judotexeira.adapters.controller;

import com.projetojudo.judotexeira.core.entities.Galeria;
import com.projetojudo.judotexeira.core.usecases.GaleriaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/galerias")
@RequiredArgsConstructor
public class GaleriaController {

    private final GaleriaUseCase galeriaUseCase;

    @PostMapping
    public ResponseEntity<Galeria> salvar(@RequestBody Galeria galeria) {
        Galeria salvo = galeriaUseCase.salvar(galeria);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Galeria> buscarPorId(@PathVariable Long id) {
        Optional<Galeria> galeria = galeriaUseCase.buscarPorId(id);
        return galeria.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Galeria>> listarTodos() {
        List<Galeria> galerias = galeriaUseCase.listarTodos();
        return ResponseEntity.ok(galerias);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        galeriaUseCase.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
