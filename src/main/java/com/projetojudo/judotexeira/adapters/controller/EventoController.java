package com.projetojudo.judotexeira.adapters.controller;

import com.projetojudo.judotexeira.core.entities.Evento;
import com.projetojudo.judotexeira.core.usecases.EventoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/eventos")
@RequiredArgsConstructor
public class EventoController {

    private final EventoUseCase eventoUseCase;

    @PostMapping
    public ResponseEntity<Evento> salvar(@RequestBody Evento evento) {
        Evento salvo = eventoUseCase.salvar(evento);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> buscarPorId(@PathVariable Long id) {
        Optional<Evento> evento = eventoUseCase.buscarPorId(id);
        return evento.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Evento>> listarTodos() {
        List<Evento> eventos = eventoUseCase.listarTodos();
        return ResponseEntity.ok(eventos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        eventoUseCase.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
