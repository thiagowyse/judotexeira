package com.projetojudo.judotexeira.adapters.controller;

import com.projetojudo.judotexeira.core.entities.Faq;
import com.projetojudo.judotexeira.core.usecases.FaqUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/faqs")
@RequiredArgsConstructor
public class FaqController {

    private final FaqUseCase faqUseCase;

    @PostMapping
    public ResponseEntity<Faq> salvar(@RequestBody Faq faq) {
        Faq salvo = faqUseCase.salvar(faq);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Faq> buscarPorId(@PathVariable Long id) {
        Optional<Faq> faq = faqUseCase.buscarPorId(id);
        return faq.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Faq>> listarTodos() {
        List<Faq> faqs = faqUseCase.listarTodos();
        return ResponseEntity.ok(faqs);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        faqUseCase.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
