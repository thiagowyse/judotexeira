package com.projetojudo.judotexeira.adapters.controller;

import com.projetojudo.judotexeira.core.entities.ParticipanteEvento;
import com.projetojudo.judotexeira.core.usecases.ParticipanteEventoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/participantes")
@RequiredArgsConstructor
public class ParticipanteEventoController {

    private final ParticipanteEventoUseCase participanteUseCase;

    @PostMapping
    public ResponseEntity<ParticipanteEvento> salvar(@RequestBody ParticipanteEvento participante) {
        ParticipanteEvento salvo = participanteUseCase.salvar(participante);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParticipanteEvento> buscarPorId(@PathVariable Long id) {
        Optional<ParticipanteEvento> participante = participanteUseCase.buscarPorId(id);
        return participante.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/evento/{idEvento}")
    public ResponseEntity<List<ParticipanteEvento>> listarPorEvento(@PathVariable Long idEvento) {
        List<ParticipanteEvento> participantes = participanteUseCase.listarPorEvento(idEvento);
        return ResponseEntity.ok(participantes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        participanteUseCase.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
