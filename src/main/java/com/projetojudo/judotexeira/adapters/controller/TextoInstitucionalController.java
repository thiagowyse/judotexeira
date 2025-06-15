package com.projetojudo.judotexeira.adapters.controller;

import com.projetojudo.judotexeira.core.entities.TextoInstitucional;
import com.projetojudo.judotexeira.core.usecases.TextoInstitucionalUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/textosinstitucionais")
@RequiredArgsConstructor
public class TextoInstitucionalController {

    private final TextoInstitucionalUseCase textoInstitucionalUseCase;

    @PostMapping
    public ResponseEntity<TextoInstitucional> salvar(@RequestBody TextoInstitucional texto) {
        TextoInstitucional salvo = textoInstitucionalUseCase.salvar(texto);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TextoInstitucional> buscarPorTipo(@PathVariable String tipo) {
        Optional<TextoInstitucional> texto = textoInstitucionalUseCase.buscarPorTipo(tipo);
        return texto.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<TextoInstitucional>> listarTodos() {
        List<TextoInstitucional> textos = textoInstitucionalUseCase.listarTodos();
        return ResponseEntity.ok(textos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        textoInstitucionalUseCase.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
